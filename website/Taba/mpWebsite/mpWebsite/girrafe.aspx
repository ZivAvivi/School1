﻿<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="girrafe.aspx.cs" Inherits="mpWebsite.HTML_links.Animals.girrafe" %>
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
        <h1> <u>גירף</u></h1>
        <a href="Animals.aspx"><p style="color: #134074; font-style: italic; font-weight: bolder; ">חזור לדף הראשי</p></a>
    </div>

    <ol style="list-style-type: upper-roman;">
        <li><a href="#aodot">אודות</a></li>
        <li><a href="#evo">אבולוציה</a></li>
        <li><a href="#behave">התנהגות</a></li>
    </ol>
    <hr />

    <h2 id="aodot">אודות</h2>
    <img style="float: right" src="../../pics/giraffe.png" alt="גירף" title="גירף" />
    <p>ג'ירף או בשמו העממי ג'ירפה (שם מדעי: Giraffa) הוא סוג פרסתן מעלה גירה ממשפחת הג'ירפיים, הכולל ארבעה מינים. הג'ירף נחשב לחיה היבשתית הגבוהה בעולם[</p>
    <p>לג'ירף רגליים וצוואר ארוכים מאוד. גובה כתפיו כ-3 מטרים מעל הקרקע וגובה ראשו כ־5.3 מטר מעל פני הקרקע. צבעו חום-צהוב עם כתמים כהים וגדולים. צבע זה משמש לו בתור הסוואה מאויביו. ראיית הג'ירף חדה, והוא מיטיב לרוץ ולהימלט מאויביו במהירות של עד 60–65 קמ"ש.</p>
    <br />
    <a href="#top"><img src="../../pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />

    <h2 id="evo">אבולוציה</h2>
    <p>הג'ירפה היא אחד משני הזנים החיים היחידים של משפחת הג'ירפים בסדר ארטיודקטילה, השני הוא האוקאפי.[8] הם מעלי גירה של ה-Clade Pecora, יחד עם Antilocapridae (חוצים), Cervidae (צבאים), Bovidae (בקר, אנטילופות, עיזים וכבשים) ו-Moschidae (צבי מושק). מחקר גנום משנת 2019 (קלדוגרמה למטה) מגלה שג'יראפידים הם טקסון אחות לאנטילוקאפרידה, עם פיצול מוערך של למעלה מ-20 מיליון שנה</p>
    <br />
    <a href="#top"><img src="../../pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />

    <h2 id="behave">התנהגות</h2>
    <p>נקבות הג'ירף חיות בקבוצות המונות כתריסר פרטים, ולעיתים מספר זכרים צעירים. אלו האחרונים נוטים לחיות בקבוצות "רווקים", והזכרים הבוגרים חיים בבדידות. זכר אחד עשוי להזדווג עם מספר נקבות, ולאו דווקא עם נקבה אחת. בדרך זו, מספר מועט של זכרים בוגרים בעדר מעברים את כל הנקבות הפורות בו. פוריות הנקבות נקבעת על ידי הזכרים על ידי טעימת השתן שלהן, בתהליך רב-שלבים (flehmen response) בו בודקים הזכרים אם הנקבה נמצאת בתקופת הייחום.</p>
    <p> משך ההיריון של הנקבה נע בין 14 ל-15 חודשים, בסופם היא ממליטה ולד אחד בלבד. תהליך הלידה מתבצע בעמידה, והשלייה נקרעת לרוב עם נפילתו של הוולד לקרקע. גובהם של הגורים בעת היוולדם נע בין 1.8 ל-2 מטרים. בתוך 20 דקות יוכלו הגורים לעמוד על רגליהם ולינוק מאמם, ובתוך מספר שעות יהיה ביכולתם לרוץ ולהתרוצץ, כך שלא יהיה הבדל בין התנהגותם להתנהגותם של גורים בני שבוע. עם זאת, בשבועיים הראשונים לחייהם הם מבלים את מרבית זמנם ברביצה על הקרקע לצד אמם ששומרת עליהם. בעוד שאריות ותניני היאור הם הטורפים היחידים התוקפים את הג'ירפים הבוגרים, גורי הג'ירף יכולים להיות טרף קל גם לנמרים, לצבועים ולזאבים טלואים. לפי מספר השערות, הנקודות המצויות על עורם של הגורים משמשות כמעין הסוואה. רק כ-25 עד 50 אחוזים מגורי הג'ירף מגיעים לבגרות; תוחלת החיים שלהם בטבע נעה בין 20 ל-25 שנים, ול-28 שנים בממוצע בשבי. </p>
    <br />
    <a href="#top"><img src="../../pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>

</asp:Content>
