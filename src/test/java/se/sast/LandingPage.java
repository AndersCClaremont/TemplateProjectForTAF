package se.sast;

import se.claremont.autotest.websupport.DomElement;

/**
 * Created by jordam on 2017-04-07.
 */
public class LandingPage {
    //Auto-generated with mapCurrentPage() method of WebInteractionMethods.


    public static DomElement wrapper_Div() {
        return new DomElement("wrapper", DomElement.IdentificationType.BY_ID);
    }

    public static DomElement header_Div() {
        return new DomElement("header", DomElement.IdentificationType.BY_ID);
    }

    public static DomElement logo_Div() {
        return new DomElement("logo", DomElement.IdentificationType.BY_CLASS);
    }

    public static DomElement srcImages_sastLogo3_gif_Img() {
        return new DomElement("src=images/sast_logo3.gif", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement srcImages_sastByline_gif_Img() {
        return new DomElement("src=images/sast_byline.gif", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement srcImages_placeholder44_jpg_Img() {
        return new DomElement("src=images/placeholder44.jpg", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement srcImages_englishFlag_jpg_Img() {
        return new DomElement("src=images/english_flag.jpg", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement menu_Div() {
        return new DomElement("menu", DomElement.IdentificationType.BY_CLASS);
    }

    public static DomElement current_ListItem() {
        return new DomElement("current", DomElement.IdentificationType.BY_CLASS);
    }

    public static DomElement hem_Link() {
        return new DomElement("HEM", DomElement.IdentificationType.BY_LINK_TEXT);
    }

    public static DomElement omSast_Link() {
        return new DomElement("OM SAST", DomElement.IdentificationType.BY_LINK_TEXT);
    }

    public static DomElement medlem_Link() {
        return new DomElement("MEDLEM", DomElement.IdentificationType.BY_LINK_TEXT);
    }

    public static DomElement qMoten_Link() {
        return new DomElement("Q-MÖTEN", DomElement.IdentificationType.BY_LINK_TEXT);
    }

    public static DomElement iseb_Istqb_Sstb_Link() {
        return new DomElement("ISEB / ISTQB / SSTB", DomElement.IdentificationType.BY_LINK_TEXT);
    }

    public static DomElement konf_AmpersandKurser_Link() {
        return new DomElement("KONF. & KURSER", DomElement.IdentificationType.BY_LINK_TEXT);
    }

    public static DomElement forSponsorer_Link() {
        return new DomElement("FÖR SPONSORER", DomElement.IdentificationType.BY_LINK_TEXT);
    }

    public static DomElement lankar_Link() {
        return new DomElement("LÄNKAR", DomElement.IdentificationType.BY_LINK_TEXT);
    }

    public static DomElement lokalaForeningar_Link() {
        return new DomElement("LOKALA FÖRENINGAR", DomElement.IdentificationType.BY_LINK_TEXT);
    }

    public static DomElement container_Div() {
        return new DomElement("container", DomElement.IdentificationType.BY_CLASS);
    }

    public static DomElement content_Div() {
        return new DomElement("content", DomElement.IdentificationType.BY_CLASS);
    }

    public static DomElement valkommenTillSast_MainHeading() {
        return new DomElement("//h1[contains(text(),'Välkommen till SAST!')]", DomElement.IdentificationType.BY_X_PATH);
    }

    public static DomElement _tdAtvalignmiddleAndAtalignleft_Td() {
        return new DomElement("//td[@valign='middle' and @align='left']", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement bokadeDatumForQMotenIStockholm2017_Heading() {
        return new DomElement("//h2[contains(text(),'Bokade datum för Q-möten i Stockholm 2017')]", DomElement.IdentificationType.BY_X_PATH);
    }

    public static DomElement columncontainer_Div() {
        return new DomElement("columncontainer", DomElement.IdentificationType.BY_CLASS);
    }

    public static DomElement senasteNytt_Heading() {
        return new DomElement("//h2[contains(text(),'Senaste nytt')]", DomElement.IdentificationType.BY_X_PATH);
    }

    public static DomElement nyttNyhetsbrevPublicerat_Link() {
        return new DomElement("Nytt nyhetsbrev publicerat", DomElement.IdentificationType.BY_LINK_TEXT);
    }

    public static DomElement samtligaPresentationerFranQ1StockholmUpplagda_Link() {
        return new DomElement("Samtliga presentationer från Q1 Stockholm upplagda", DomElement.IdentificationType.BY_LINK_TEXT);
    }

    public static DomElement kommandeSastHandelser_Heading() {
        return new DomElement("//h2[contains(text(),'Kommande SAST-händelser')]", DomElement.IdentificationType.BY_X_PATH);
    }

    public static DomElement width40Proc_Td() {
        return new DomElement("width=40%", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement _20170427_Strong() {
        return new DomElement("//strong[contains(text(),'2017-04-27')]", DomElement.IdentificationType.BY_X_PATH);
    }

    public static DomElement q2Stockholm_Link() {
        return new DomElement("Q2 Stockholm", DomElement.IdentificationType.BY_LINK_TEXT);
    }

    public static DomElement motessponsor_Heading() {
        return new DomElement("//h2[contains(text(),'Mötessponsor')]", DomElement.IdentificationType.BY_X_PATH);
    }

    public static DomElement kommandeMotesHuvudsponsor_stockholm__Td() {
        return new DomElement("//td[contains(text(),'Kommande mötes huvudsponsor (Stockholm):')]", DomElement.IdentificationType.BY_X_PATH);
    }

    public static DomElement srcImages_sponsorHpe_png_Img() {
        return new DomElement("src=images/sponsor_hpe.png", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement foregaendeMotessponsorer_stockholm__Td() {
        return new DomElement("//td[contains(text(),'Föregående mötessponsorer (Stockholm):')]", DomElement.IdentificationType.BY_X_PATH);
    }

    public static DomElement srcImages_sponsorApicasystems_png_Img() {
        return new DomElement("src=images/sponsor_apicasystems.png", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement hrGrey_Div() {
        return new DomElement("hr_grey", DomElement.IdentificationType.BY_CLASS);
    }

    public static DomElement webbsponsorer_Paragraph() {
        return new DomElement("//p[contains(text(),'Webbsponsorer')]", DomElement.IdentificationType.BY_X_PATH);
    }

    public static DomElement srcImages_sponsorKonsultbolag1_jpg_Img() {
        return new DomElement("src=images/sponsor_konsultbolag1.jpg", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement srcImages_sponsorCag_jpg_Img() {
        return new DomElement("src=images/sponsor_cag.jpg", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement srcImages_sponsorKnowit_gif_Img() {
        return new DomElement("src=images/sponsor_knowit.gif", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement srcImages_sponsorClaremont_png_Img() {
        return new DomElement("src=images/sponsor_claremont.png", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement srcImages_sponsorAddq_png_Img() {
        return new DomElement("src=images/sponsor_addq.png", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

    public static DomElement footer_Div() {
        return new DomElement("footer", DomElement.IdentificationType.BY_ID);
    }

    public static DomElement breaker_Div() {
        return new DomElement("breaker", DomElement.IdentificationType.BY_CLASS);
    }

    public static DomElement scrolling0_Iframe() {
        return new DomElement("scrolling=0", DomElement.IdentificationType.BY_ATTRIBUTE_VALUE);
    }

//If you run the ConstructWebPageCode() method with mapEvenBadlyIdentifiedElements = true the 62 elements now currently not mapped will get Xpath identifications.
}
