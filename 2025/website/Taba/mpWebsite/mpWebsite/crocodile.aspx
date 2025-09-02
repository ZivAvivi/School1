<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="crocodile.aspx.cs" Inherits="mpWebsite.HTML_links.Animals.crocodile" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
        <style>
        body {
            direction: rtl;
            margin-right: 50px;
            margin-left: 50px;
            margin-top: 25px;
            margin-bottom: 25px;
            background-color: #EEF4ED;
            color: #134074;
            font-family: 'Modern No. 20';
            font-size: x-large;
        }

        h1 {
            font-style: italic;
            font-weight: bolder;
        }

        p {
            color: #0B2545;
            font-style: italic;
            font-weight: bolder;
            margin-bottom: -10px;
        }

        img {
            width: 150px;
            height: 150px;
            margin: 5px;
        }
    </style>
<p>
    <a href="lion.aspx">אריה</a>
    <a href="girrafe.aspx">גירף</a>
    <a href="dodo.aspx">דודו</a>
    <a href="crocodile.aspx">תנין סיאמי</a>
    <a href="lama.aspx">למה מצויה</a>
    <a href="lamor.aspx">למור</a>
</p>
    <div style="text-align: center">
        <h1> <u> תנין סיאמי</u></h1>
        <a href="Animals.aspx"><p style="color: #134074; font-style: italic; font-weight: bolder; ">חזור לדף הראשי</p></a>
    </div>

    <ol style="list-style-type: upper-roman;">
        <li><a href="#aodot">אודות</a></li>
        <li><a href="#evo">מאפיינים</a></li>
        <li><a href="#behave">התנהגות</a></li>
    </ol>
    <hr />

    <h2 id="aodot">אודות</h2>
    <img style="float: right" src="../../pics/croc.png" alt="תנין סיאמי 1" title="תנין סיאמי" />
    <p>תנין סיאמי (שם מדעי: Crocodylus siamensis) הוא מין של תנין ממשפחת התניניים החי בדרום-מזרח אסיה.</p>
    <p>מין זה בינוני בגודלו אך קטן יחסית למינים אחרים בסוג תנין. אורכו 2.1 מטרים (6.9 רגל) משקלו מגיע ל-40–70 ק"ג, אם כי פרטים הרבה יותר גדולים התגלו, כשהגדול ביותר הגיע לאורך 4 מטרים (13 רגל) ושקל 350 ק"ג. התנינים גדולים הרבה יותר כשהם בשבי. לתנין זה חרטום מוארך, קשקשים עבים מעל העיניים וצבעם ירוק-זית עד ירוק כהה.</p>
    <br />
    <a href="#top"><img src="../../pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />

    <h2 id="evo">מאפיינים</h2>
    <p>מין זה בינוני בגודלו אך קטן יחסית למינים אחרים בסוג תנין. אורכו 2.1 מטרים (6.9 רגל) משקלו מגיע ל-40–70 ק"ג, אם כי פרטים הרבה יותר גדולים התגלו, כשהגדול ביותר הגיע לאורך 4 מטרים (13 רגל) ושקל 350 ק"ג. התנינים גדולים הרבה יותר כשהם בשבי. לתנין זה חרטום מוארך, קשקשים עבים מעל העיניים וצבעם ירוק-זית עד ירוק כהה.</p>
    <p>בעבר תנין זה היה נפוץ בכל דרום-מזרח אסיה. כיום הוא מוגבל למדינות: אינדונזיה (בעיקר בבורנאו ובג'אווה), ברוניי, מלזיה, לאוס, קמבודיה, בורמה, וייטנאם ותאילנד (או סיאם), ממנה קיבל את שמו</p>
    <p>הוא מצוי במים מתוקים באגמים, נהרות איטיים וביצות והוא יכול להימצא גם מחוץ למים זמן ממושך</p>
    <br />
    <a href="#top"><img src="../../pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />

    <h2 id="behave">התנהגות</h2>
    <p>
        למרות חששות השימור, היבטים רבים של תולדות החיים של C. siamensis בטבע נותרו לא ידועים, במיוחד בנוגע לביולוגיה הרבייה שלו.[11]

        מבוגרים ניזונים בעיקר מדגים ונחשים, אך אוכלים גם דו-חיים ויונקים קטנים.[3]

        מעט מאוד ידוע על ההיסטוריה הטבעית של מין זה בטבע, אך הנקבות בונות קנים תלים הבנויים מפסולת צמחים מגורדת מעורבת בבוץ.[6] בשבי, תנינים אלו מתרבים במהלך העונה הרטובה (אפריל עד מאי), כשהם מטילים בין 15 ל-50 ביצים, אשר לאחר מכן נשמרות עד לבקיעתן.[12] לאחר הדגירה, הנקבה תסייע לגורים שלה כשהם פורצים מביציהם ולאחר מכן נושאת את הדגירה למים בלסתותיה.
    </p>
    <br />
    <a href="#top"><img src="../../pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>

</asp:Content>
