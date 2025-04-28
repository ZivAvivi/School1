<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="mainPage.aspx.cs" Inherits="Final.mainPage" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
    <style>
        img {
            width: 150px;
            height: 150px;
            margin: 5px;
        }
    </style>


</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <ol style="list-style-type: upper-roman;">
        <li><a href="#about">עלינו</a></li>
        <li><a href="#history">היסטוריה</a></li>
        <li><a href="#unique">מודל הארגון</a></li>
    </ol>
    <hr />

 <h2 id="about">עלינו</h2>
    <p>"לב אחד - סיוע אזרחי בחירום" היא עמותה ישראלית רשומה המפעילה תשתית מתנדבים במצבי חירום, בהם אוכלוסייה גדולה נזקקת לסיוע.</p>
    <p>המודל הייחודי של הארגון מתמקד בשלושה מישורים: גיוס מתנדבים מתוך האוכלוסייה הנצרכת והפיכתם בכך לפעילים, משפיעים ומועילים; עבודה ישירה תחת הרשות המקומית באופן מסודר וריכוזי, וכן הכשרת צוותי פעולה בעת שגרה, הנכונים ל"הקפצה" בכל רגע. מאז הקמתו הפעיל "לב אחד" למעלה מ-26,000 מתנדבים בפריסה ארצית</p>
    <a href="about.aspx">...קרא עוד</a>
    <div style="text-align: center;">
        <img src="Pics/pic13.jpg" alt="תמונה1" title="1תמונה" />
        <img src="Pics/pic1.jpg" alt="תמונה3" title="תמונה2" />
        <img src="Pics/pic10.jpg" alt="תמונה3" title="תמונה3" />
    </div>
    <a href="#top"><img src="pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />

    <h2 id="history">היסטוריה</h2>
    <p>ארגון 'לב אחד' החל לפעול בשנת 2005 במטרה לסייע לתושבי גוש קטיף שפונו במסגרת תוכנית ההתנתקות. מייסדיו היו מדריכים וחניכים מהמכינה הקדם-צבאית 'עין פרת - המדרשה למנהיגות חברתית' שבכפר אדומים, ביוזמתה של בוגרת המכינה, יערה פירון, ובהובלתו של אילי צור, מדריך במכינה שהיה גם מנהלו הראשון של הארגון. בראשית דרכו הפעיל הארגון צוותי מתנדבים שסייעו למשפחות במהלך הפינוי ולאחריו. שנה לאחר מכן נרשם הארגון כעמותה ופעל בקרב האוכלוסייה האזרחית ביישובי הצפון, במהלך מלחמת לבנון השנייה.</p>
    <a href="history.aspx">...קרא עוד</a>
    <div style="text-align: center">
        <img src="Pics/pic5.jpg" alt="תמונה1" title="1תמונה" />
        <img src="Pics/pic6.jpg" alt="תמונה3" title="תמונה2" />
        <img src="Pics/pic3.jpg" alt="תמונה3" title="תמונה3" />
    </div>
    <a href="#top"><img src="pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />

    <h2 id="unique">המודל הייחודי של הארגון</h2>
    <p>פעילות מתנדבי 'לב אחד' בתוכנית ההתנתקות ובמלחמת לבנון השנייה חידדו את הצורך ביצירת תשתית קבועה של מתנדבים, שיפעלו באופן מסודר ומרוכז מתוך האוכלוסייה האזרחית עצמה. לצורך כך גובש מודל פעילות ייחודי:</p>
    <a href="unique.aspx">...קרא עוד</a>
    <div style="text-align: center">
        <img src="Pics/pic2.jpg" alt="תמונה1" title="1תמונה" />
        <img src="Pics/pic8.jpg" alt="תמונה3" title="תמונה2" />
        <img src="Pics/pic9.jpg" alt="תמונה3" title="תמונה3" />
    </div>
    <a href="#top"><img src="pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />
</asp:Content>
