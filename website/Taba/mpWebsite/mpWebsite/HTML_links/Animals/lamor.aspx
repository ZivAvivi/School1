<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="lamor.aspx.cs" Inherits="mpWebsite.HTML_links.Animals.lamor" %>
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
        <h1> <u> למור</u></h1>
        <a href="../../Animals.html"><p style="color: #134074; font-style: italic; font-weight: bolder; ">חזור לדף הראשי</p></a>
    </div>

    <ol style="list-style-type: upper-roman;">
        <li><a href="#aodot">אודות</a></li>
        <li><a href="#evo">אבולוציה</a></li>
        <li><a href="#behave">התנהגות</a></li>
    </ol>
    <hr />

    <h2 id="aodot">אודות</h2>
    <img style="float: right" src="../../pics/lamor3.png" alt="למור 1" title="למור" />
    <p>למור (שם מדעי: Eulemur), הוא סוג פרימטים ממשפחת הלמוריים החיים באי מדגסקר.</p>
    <p>אורך למורים אלה 30–50 ס"מ ומשקלם 2–4 ק"ג. הם בעלי חוטם שחור מוארך ועיניים זהובות גדולות. הם שעירים ובעלי זנב ארוך והם יודעים לקפץ במהירות בין הענפים. הם יכולים לקפץ גם על הקרקע. צבע הפרווה משתנה מאדום אצל המין למור אדום לחום אצל המין למור חום.</p>
    <br />
    <a href="#top"><img src="../../pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />

    <h2 id="evo">אבולוציה</h2>
    <p>כל מאובני היונקים ממדגסקר מגיעים מהתקופה האחרונה. לפיכך, מעט ידוע על התפתחותו של הלמור הטבעתי, שלא לדבר על שאר הלמור, הכולל את כל אוכלוסיית הפרימטים האנדמית של האי. עם זאת, עדויות כרומוזומליות ומולקולריות מצביעות על כך שלמורים קשורים יותר זה לזה מאשר לפרימטים אחרים של סטרפסירין. כדי שזה קרה, חושבים שאוכלוסיית אבות קטנה מאוד הגיעה למדגסקר באמצעות אירוע רפטינג בודד לפני 50 עד 80 מיליון שנה. קרינה אבולוציונית ויצירת מין יצרו את המגוון של הלמורים המלגזיים הנראים כיום</p>
    <br />
    <a href="#top"><img src="../../pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />

    <h2 id="behave">התנהגות</h2>
    <p>הלמורים בעלי הזנב הטבעתי חיים בקבוצות הידועות בשם "חיילים", אשר מסווגות כקבוצות מרובות זכרים, עם מטרילין כקבוצת הליבה. כמו ברוב הלמורים, הנקבות שולטות חברתית בזכרים בכל הנסיבות, כולל עדיפות האכלה. הדומיננטיות נאכפת על ידי התנפלות, רדיפה, אזוק, אחיזה ונשיכה. נקבות צעירות לא תמיד יורשות את דרגת אמם וזכרים צעירים עוזבים את החבורה בין גיל שלוש לחמש. לשני המינים יש היררכיות דומיננטיות נפרדות; לנקבות יש היררכיה ברורה בעוד שדרגת הגבר מתואמת עם הגיל. לכל חיל יש אחד עד שלושה זכרים בוגרים מרכזיים בדרגים גבוהים, אשר מקיימים אינטראקציה עם נקבות יותר מזכרים קבוצתיים אחרים ומובילים את תהלוכת החיילים עם נקבות בעלות דרג גבוה. זכרים שהועברו לאחרונה, זכרים זקנים או זכרים בוגרים שעדיין לא עזבו את קבוצת הלידה שלהם נמצאים לרוב בדרג נמוך יותר. כשהם שוהים בפריפריה של הקבוצה הם נוטים להידחק לשוליים מפעילות הקבוצה.</p>
    <br />
    <a href="#top"><img src="../../pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>

</asp:Content>
