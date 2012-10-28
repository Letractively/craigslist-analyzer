package com.crawl.model;

/**
 * Craigslist "For Sale" Category
 * @author mschimpf
 *
 */
public enum CraigslistCategoryEnum{
	MAIN_TOPIC__COMMUNITY("ccc"), 
	MAIN_TOPIC__PERSONALS(""), 
	MAIN_TOPIC__DISCUSSION_FORUMS("forums"), 
	MAIN_TOPIC__HOUSING("hhh"), 
	MAIN_TOPIC__FOR_SALE("sss"), 
	MAIN_TOPIC__SERVICES("bbb"),
	MAIN_TOPIC__JOBS("jjj"),
	MAIN_TOPIC__GIGS("ggg"),
	MAIN_TOPIC__RESUMES("res"),
	
	COMMUNITY__ACTIVITIES(""),
	COMMUNITY__ARTISTS(""),
	COMMUNITY__CHILDCARE(""),
	COMMUNITY__GENERAL(""),
	COMMUNITY__GROUPS(""),
	COMMUNITY__PETS(""),
	COMMUNITY__EVENTS(""),
	COMMUNITY__LOST_FOUND(""),
	COMMUNITY__MUSICIANS(""),
	COMMUNITY__LOCAL_NEWS(""),
	COMMUNITY__POLITICS(""),
	COMMUNITY__RIDESHARE(""),
	COMMUNITY__VOLUNTEERS(""),
	COMMUNITY__CLASSES(""),
	
	PERSONALS__STRICTLY_PLATONIC(""),
	PERSONALS__WOMEN_SEEK_WOMEN(""),
	PERSONALS__WOMEN_SEEKING_MEN(""),
	PERSONALS__MEN_SEEKING_WOMEN(""),
	PERSONALS__MEN_SEEKING_MEN(""),
	PERSONALS__MISC_ROMANCE(""),
	PERSONALS__CASUAL_ENCOUNTERS(""),
	PERSONALS__MISSED_CONNECTIONS(""),
	PERSONALS__RANTS_AND_RAVES(""),
	
	DISCUSSION_FORUMS__1099("forums/?forumID="+10),
	DISCUSSION_FORUMS__APPLE("forums/?forumID="+10),
	DISCUSSION_FORUMS__ARTS("forums/?forumID="+10),
	DISCUSSION_FORUMS__ATHEIST("forums/?forumID="+10),
	DISCUSSION_FORUMS__AUTOS("forums/?forumID="+10),
	DISCUSSION_FORUMS__BEAUTY("forums/?forumID="+10),
	DISCUSSION_FORUMS__BIKES("forums/?forumID="+10),
	DISCUSSION_FORUMS__CELEBS("forums/?forumID="+10),
	DISCUSSION_FORUMS__COMP("forums/?forumID="+10),
	DISCUSSION_FORUMS__CRAFTS("forums/?forumID="+10),
	DISCUSSION_FORUMS__DIET("forums/?forumID="+10),
	DISCUSSION_FORUMS__DIVORCE("forums/?forumID="+10),
	DISCUSSION_FORUMS__DYING("forums/?forumID="+10),
	DISCUSSION_FORUMS__ECO("forums/?forumID="+10),
	DISCUSSION_FORUMS__EDUC("forums/?forumID="+10),
	DISCUSSION_FORUMS__ETIQUET("forums/?forumID="+10),
	DISCUSSION_FORUMS__FEEDBK("forums/?forumID="+10),
	DISCUSSION_FORUMS__FILM("forums/?forumID="+10),
	DISCUSSION_FORUMS__FITNESS("forums/?forumID="+10),
	DISCUSSION_FORUMS__FIXIT("forums/?forumID="+10),
	DISCUSSION_FORUMS__FOOD("forums/?forumID="+10),
	DISCUSSION_FORUMS__FRUGAL("forums/?forumID="+10),
	DISCUSSION_FORUMS__GAMING("forums/?forumID="+10),
	DISCUSSION_FORUMS__GARDEN("forums/?forumID="+10),
	DISCUSSION_FORUMS__GIFTS("forums/?forumID="+10),
	DISCUSSION_FORUMS__HAIKU("forums/?forumID="+10),
	DISCUSSION_FORUMS__HEALTH("forums/?forumID="+10),
	DISCUSSION_FORUMS__HELP("forums/?forumID="+10),
	DISCUSSION_FORUMS__HISTORY("forums/?forumID="+10),
	DISCUSSION_FORUMS__HOUSING("forums/?forumID="+10),
	DISCUSSION_FORUMS__JOBS("forums/?forumID="+10),
	DISCUSSION_FORUMS__JOKES("forums/?forumID="+10),
	DISCUSSION_FORUMS__KINK("forums/?forumID="+10),
	DISCUSSION_FORUMS__LTR("forums/?forumID="+10),
	DISCUSSION_FORUMS__LEGAL("forums/?forumID="+10),
	DISCUSSION_FORUMS__LINUX("forums/?forumID="+10),
	DISCUSSION_FORUMS__LOCPOL("forums/?forumID="+10),
	DISCUSSION_FORUMS__M4M("forums/?forumID="+10),
	DISCUSSION_FORUMS__MONEY("forums/?forumID="+10),
	DISCUSSION_FORUMS__MOTOCY("forums/?forumID="+10),
	DISCUSSION_FORUMS__MUSIC("forums/?forumID="+10),
	DISCUSSION_FORUMS__NPO("forums/?forumID="+10),
	DISCUSSION_FORUMS__OPEN("forums/?forumID="+10),
	DISCUSSION_FORUMS__OUTDOOR("forums/?forumID="+10),
	DISCUSSION_FORUMS__OVER50("forums/?forumID="+10),
	DISCUSSION_FORUMS__POC("forums/?forumID="+10),
	DISCUSSION_FORUMS__PARENT("forums/?forumID="+10),
	DISCUSSION_FORUMS__PEFO("forums/?forumID="+10),
	DISCUSSION_FORUMS__PETS("forums/?forumID="+10),
	DISCUSSION_FORUMS__PHILOS("forums/?forumID="+10),
	DISCUSSION_FORUMS__POLITIC("forums/?forumID="+10),
	DISCUSSION_FORUMS__PSYCH("forums/?forumID="+10),
	DISCUSSION_FORUMS__QUEER("forums/?forumID="+10),
	DISCUSSION_FORUMS__RECOVER("forums/?forumID="+10),
	DISCUSSION_FORUMS__RELIGION("forums/?forumID="+10),
	DISCUSSION_FORUMS__ROFO("forums/?forumID="+10),
	DISCUSSION_FORUMS__SCIENCE("forums/?forumID="+10),
	DISCUSSION_FORUMS__SHOP("forums/?forumID="+10),
	DISCUSSION_FORUMS__SPIRIT("forums/?forumID="+10),
	DISCUSSION_FORUMS__SPORTS("forums/?forumID="+10),
	DISCUSSION_FORUMS__TV("forums/?forumID="+10),
	DISCUSSION_FORUMS__TAX("forums/?forumID="+10),
	DISCUSSION_FORUMS__TESTING("forums/?forumID="+10),
	DISCUSSION_FORUMS__TRANSG("forums/?forumID="+10),
	DISCUSSION_FORUMS__TRAVEL("forums/?forumID="+10),
	DISCUSSION_FORUMS__VEGAN("forums/?forumID="+10),
	DISCUSSION_FORUMS__W4W("forums/?forumID="+10),
	DISCUSSION_FORUMS__WED("forums/?forumID="+10),
	DISCUSSION_FORUMS__WINE("forums/?forumID="+10),
	DISCUSSION_FORUMS__WOMEN("forums/?forumID="+10),
	DISCUSSION_FORUMS__WORDS("forums/?forumID="+10),
	DISCUSSION_FORUMS__WRITERS("forums/?forumID="+10),

	HOUSING__APTS_HOUSING(""),
	HOUSING__ROOMS_SHARED(""),
	HOUSING__SUBLETS_TEMPORARY(""),
	HOUSING__HOUSINGWANTED(""),
	HOUSING__HOUSINGSWAP(""),
	HOUSING__VACATIONRENTALS(""),
	HOUSING__PARKING_STORAGE(""),
	HOUSING__OFFICE_COMMERCIAL(""),
	HOUSING__REALESTATEFORSALE(""),

	FOR_SALE__APPLIANCES("ppa"), 
	FOR_SALE__ANTIQUES("ata"), 
	FOR_SALE__BARTER("bar"), 
	FOR_SALE__BIKES("bia"), 
	FOR_SALE__BOATS("boo"), 
	FOR_SALE__BOOKS("bka"), 
	FOR_SALE__BUSINESS("bfa"), 
	FOR_SALE__COMPUTER("sya"), 
	FOR_SALE__FREE("zip"), 
	FOR_SALE__FURNITURE("fua"), 
	FOR_SALE__GENERAL("foa"), 
	FOR_SALE__JEWELRY("jwa"), 
	FOR_SALE__MATERIALS("maa"), 
	FOR_SALE__RVS("rva"), 
	FOR_SALE__SPORTING("sga"), 
	FOR_SALE__TICKETS("tia"), 
	FOR_SALE__TOOLS("tla"), 
	FOR_SALE__WANTED("wan"), 
	FOR_SALE__ARTS_CRAFTS("ara"), 
	FOR_SALE__AUTO_PARTS("pta"), 
	FOR_SALE__BABY_KIDS("baa"), 
	FOR_SALE__BEAUTY_HLTH("haa"), 
	FOR_SALE__CARS_TRUCKS("i/autos"), 
	FOR_SALE__CDS_DVD_VHS("ema"), 
	FOR_SALE__CELL_PHONES("moa"), 
	FOR_SALE__CLOTHES_ACC("cla"), 
	FOR_SALE__COLLECTIBLES("cba"), 
	FOR_SALE__ELECTRONICS("ela"), 
	FOR_SALE__FARM_GARDEN("gra"), 
	FOR_SALE__GARAGE_SALE("gms"), 
	FOR_SALE__HOUSEHOLD("hsa"), 
	FOR_SALE__MOTORCYCLES("mca"), 
	FOR_SALE__MUSIC_INSTR("msa"), 
	FOR_SALE__PHOTO_VIDEO("pha"), 
	FOR_SALE__TOYS_GAMES("taa"), 
	FOR_SALE__VIDEO_GAMING("vga"),
	
	SERVICES__BEAUTY(""),
	SERVICES__CREATIVE(""),
	SERVICES__COMPUTER(""),
	SERVICES__CYCLE(""),
	SERVICES__EVENT(""),
	SERVICES__FINANCIAL(""),
	SERVICES__LEGAL(""),
	SERVICES__LESSONS(""),
	SERVICES__MARINE(""),
	SERVICES__PET(""),
	SERVICES__AUTOMOTIVE(""),
	SERVICES__FARM_GARDEN(""),
	SERVICES__HOUSEHOLD(""),
	SERVICES__LABOR_MOVE(""),
	SERVICES__SKILL_DTRADE(""),
	SERVICES__REALESTATE(""),
	SERVICES__SMBIZADS(""),
	SERVICES__THERAPEUTIC(""),
	SERVICES__TRAVEL_VAC(""),
	SERVICES__WRITE_ED_TR8(""),
	
	JOBS__ACCOUNTING_FINANCE(""),
	JOBS__ADMIN_OFFICE(""),
	JOBS__ARCH_ENGINEERING(""),
	JOBS__ART_MEDIA_DESIGN(""),
	JOBS__BIOTECH_SCIENCE(""),
	JOBS__BUSINESS_MGMT(""),
	JOBS__CUSTOMERSERVICE(""),
	JOBS__EDUCATION(""),
	JOBS__FOOD_BEV_HOSP(""),
	JOBS__GENERALLABOR(""),
	JOBS__GOVERNMENT(""),
	JOBS__HUMANRESOURCES(""),
	JOBS__INTERNETENGINEERS(""),
	JOBS__LEGAL_PARALEGAL(""),
	JOBS__MANUFACTURING(""),
	JOBS__MARKETING_PR_AD(""),
	JOBS__MEDICAL_HEALTH(""),
	JOBS__NONPROFITSECTOR(""),
	JOBS__REALESTATE(""),
	JOBS__RETAIL_WHOLESALE(""),
	JOBS__SALES_BIZDEV(""),
	JOBS__SALON_SPA_FITNESS(""),
	JOBS__SECURITY(""),
	JOBS__SKILLEDTRADE_CRAFT(""),
	JOBS__SOFTWARE_QA_DBA(""),
	JOBS__SYSTEMS_NETWORK(""),
	JOBS__TECHNICALSUPPORT(""),
	JOBS__TRANSPORT(""),
	JOBS__TV_FILM_VIDEO(""),
	JOBS__WEB_INFODESIGN(""),
	JOBS__WRITING_EDITING(""),
	JOBS__ETC(""),
	JOBS__PART_TIME(""),

	GIGS__CREW(""),
	GIGS__EVENT(""),
	GIGS__LABOR(""),
	GIGS__TALENT(""),
	GIGS__COMPUTER(""),
	GIGS__CREATIVE(""),
	GIGS__DOMESTIC(""),
	GIGS__WRITING("");
	
	private String code;  
	
	private CraigslistCategoryEnum(String c) {   
		this.code = c; 
	}  
	
	public String getCode() {   
		return this.code; 
	}
}