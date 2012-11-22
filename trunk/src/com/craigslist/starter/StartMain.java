package com.craigslist.starter;

import java.io.IOException;
import java.util.Collection;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.analysis.control.AnaCrack;
import com.crawl.control.Crawler;
import com.crawl.model.CraigslistAlgorithmEnum;
import com.crawl.model.CraigslistAreasEnum;
import com.crawl.model.CraigslistCategoryEnum;
import com.crawl.model.CrawlResultPackage;

/**
 * 
 * @author mschimpf
 * 
 */
public class StartMain {
    // Define a static logger variable so that it references the
    // Logger instance named "MyApp".
    static Logger logger = Logger.getLogger(StartMain.class);

    /**
     * Init logger. This initiation is only for the main function needed. The
     * web application need his own init method.
     */
    private static void initLogger() {
        try {
            // Set up a simple configuration that logs on the console.
            BasicConfigurator.configure();

            Properties props = new Properties();
            props.load(StartMain.class.getResourceAsStream("/log4j.properties"));
            PropertyConfigurator.configure(props);

            logger.debug("Entering application.");
            logger.debug("CraigslistCategoryEnum.FOR_SALE__COMPUTER="
                    + CraigslistCategoryEnum.FOR_SALE__COMPUTER.toString());
            logger.debug("CraigslistCategoryEnum.FOR_SALE__COMPUTER="
                    + CraigslistCategoryEnum.FOR_SALE__COMPUTER.getCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Analyzing main function
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) {
        StartMain.initLogger();

        // 1. Create the crawler object
        Crawler aCrawl = Crawler.getInstance();

        // 2. Step get all offers
        Collection<CrawlResultPackage> aResultColl =aCrawl.crawlWebPages(CraigslistCategoryEnum.FOR_SALE__COMPUTER,
        // CraigslistAreasEnum.MAIN_AREA_SF_BAY_AREA,
                CraigslistAreasEnum.SAN_FRANCISCO, "Apple", 1000 /*
                                                                  * Max Offers -
                                                                  * 100 = 1 page
                                                                  */);

        logger.debug("aResultColl Size=" + aResultColl.size());

        // 3. Create analyzer object
        AnaCrack aAnaCrack = new AnaCrack();

        // 4. do the anlysing and return the offers
        Collection<CrawlResultPackage> aAnaColl = aAnaCrack.getBestOffers(
                aResultColl, /* The result collection from the crawler */
                8, /* Give me the x best offers */
                CraigslistAlgorithmEnum.BEST, /* To use algorithm */
                1, /* Lower control limit */
                1000 /* higher control limit */
        );

        int i = 0;
        for (CrawlResultPackage aPack : aAnaColl) {
            i++;
            logger.info(i + ". BEST OFFERS=" + aPack.toString());
        }

        logger.debug("Ending application.");
    }
}