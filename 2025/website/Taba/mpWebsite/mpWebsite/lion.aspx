<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="lion.aspx.cs" Inherits="mpWebsite.HTML_links.Animals.lion" %>
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
        <h1> <u> אריה</u></h1>
        <a href="Animals.aspx"><p style="color: #134074; font-style: italic; font-weight: bolder; ">חזור לדף הראשי</p></a>
    </div>

    <ol style="list-style-type: upper-roman;">
        <li><a href="#aodot">אודות</a></li>
        <li><a href="#evo">אבולוציה</a></li>
        <li><a href="#behave">התנהגות</a></li>
    </ol>
    <hr />

    <h2 id="aodot">אודות</h2>
    <img style="float: right" src="../../pics/lion.jpg" alt="אריה 1" title="אריה" />
    <p>אריה (שם מדעי: Panthera leo) הוא מין של טורף גדול מהסוג פנתר שבמשפחת החתוליים, והוא השני בגודלו בין בני הקבוצה דמויי חתול, אחרי תת-המין הסיבירי של הטיגריס.</p>
    <p>האריה נפוץ בעיקר ביבשת אפריקה, אך גם במדינת גוג'ראט שבהודו. הוא ניזון מאוכלי עשב שונים אותם הוא צד, וכן מפגרים. בתרבות האנושית נחשב האריה סמל לגבורה וכוח, ולכן הוצמד לו הכינוי "מלך החיות". תוחלת חייו בטבע היא בין 12 ל-18 שנים, אך בשבי הוא יכול לחיות עד 30 שנה. שמות נוספים של האריה בשפה העברית הם ליש, שחל, שחץ ולביא. שם נקבת האריה הוא לביאה ואריה צעיר נקרא כפיר.</p>
    <br />
    <a href="#top"><img src="../../pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />

    <h2 id="evo">אבולוציה</h2>
    <p>האריה התפתח באפריקה לפני בערך 800,000–1,000,000 שנה, לפני שנדד לאזורים ההולארקטיים.</p>
    <p>רישומי מאובנים של אריות מצביעים על כך שהופיע לראשונה באירופה לפני 700,000 שנה. מהאריה הזה התפתח אריה המערות, שהופיע לפני בערך 300,000 שנה.</p>
    <p> אריות נכחדו בצפון אירואסיה בסוף עידן הקרח האחרון (Quaternary glaciation), לפני כעשרת אלפים שנה.</p>
    <p>ניתוח הבדלים ב-DNA מיטוכונדריאלי בין תת-מינים קיימים וכאלו שנכחדו העלה כי ההתפצלות מאוכלוסיית המקור החלה לפני כ-124,000 שנים. המרחק הגנטי הגדול ביותר הוא בין האריות באפריקה שמדרום לסהרה ובין האריה הברבארי ותת המינים האסייתים.</p>
    <p>על פי ניתוח זה, האריות בדרום אפריקה מוצאם במזרח אפריקה, ואילו תת-המינים האסייתים כולל האריות שחיו במזרח התיכון – מוצאם בצפון אפריקה. משערים כי תקופת אקלים לח שהביאה להתפשטות יערות גשם ממפרץ גינאה מזרחה עד לשבר הסורי אפריקני בודדה את אריות צפון אפריקה ומערבה מהאריות שבמזרח אפריקה ובדרומה והביאה לפיצול הגנטי הראשון. פיצול נוסף התרחש בתקופת יובש והתפשטות מדבר הסהרה לפני כ-50,000 שנים שהפריד את האוכלוסייה בצפון אפריקה מזו שבמערב אפריקה.</p>
    <br />
    <a href="#top"><img src="../../pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />

    <h2 id="behave">התנהגות</h2>
    <p>האריות מבלים את רוב זמנם במנוחה; הם חסרי-פעילות בערך 20 שעות ביממה. אף שהם יכולים להיות פעילים בכל שעה, פעילותם בדרך כלל מגיעה לשיאה לאחר השקיעה – זמן שמוקדש לחברותא, טיפוח ועשיית צרכים. הפעילות נמשכת לסירוגין עד עלות השחר, שאז לעיתים קרובות מתבצע הציד. הם מבלים בממוצע שעתיים ביום בהליכה וחמישים דקות באכילה.</p>
    <br />
    <a href="#top"><img src="../../pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>

</asp:Content>
