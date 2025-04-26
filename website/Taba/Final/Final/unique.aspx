<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="unique.aspx.cs" Inherits="Final.unique" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
    <style>
        p{
            font-size:large;
        }
        img {
            width: 150px;
            height: 150px;
            margin: 5px;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <div style="text-align: center">
        <h1><u>ייחודיות הארגון</u></h1>
        <a href="mainPage.aspx"><p style="color: #134074; font-style: italic; font-weight: bolder; ">חזור לדף הראשי</p></a>
    </div>

    <ol style="list-style-type: upper-roman;">
        <li><a href="#work">עבודה תחת הרשות המקומית</a></li>
        <li><a href="#training">הכשרת צוותי פעולה בעת שגרה</a></li>
        <li><a href="#recrutments">גיוס מתנדבים מתוך האוכלוסייה</a></li>

    </ol>
    <hr />

    <h2 id="work">עבודה תחת הרשות המקומית</h2>
    <img style="float: right" src="Pics/pic7.jpg" alt="תמונה" title="תמונה" />
    <p>הרשות המקומית נקראת במצבי חירום להתמודד עם אתגרים אזרחיים רבים, אך לא פעם היא קורסת עקב חוסר ארגון והיעדר משאבים וכוח אדם, הנצרכים בעת חירום. אזרחי מדינת ישראל הוכיחו את התגייסותם במצבים כאלה לעזרה, אולם הסתבר כי אלפי המתנדבים זקוקים למנגנון הפעלה אפקטיבי, מאורגן ומתואם. המודל של ארגון 'לב אחד' מבוסס על עבודה משותפת עם רכז המתנדבים העירוני, ומעמיד לרשותו מערך גיוס והפעלה, שמאפשר לו לנהל אלפי מתנדבים בו זמנית.</p>
    <br />
    <a href="#top"><img src="Pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />

    <h2 id="training">הכשרת צוותי פעולה בעת שגרה</h2>
    <p>
        אחד הלקחים שהופקו כבר בראשית פעילותו של הארגון הוא שכדי לפעול באופן היעיל ביותר בשעת חירום יש להתכונן מבעוד מועד. לצורך כך מכשיר הארגון מובילי מתנדבים בכל רחבי הארץ בכל ימות השנה על בסיס מודל ההפעלה של הארגון, כך שבשעת חירום יודע כל אחד את מקומו וייעודו.
כדי להגיע ליעילות מרבית, פועל הארגון להנחלת עקרונות הפעלת המתנדבים במצבי חירום לגופי התנדבות אחרים, מתוך רצון ליצור שיטת הפעלה לאומית אחת, קוהרנטית ואפקטיבית בשעת חירום. במסגרת זו פועל הארגון גם עם תאי סטודנטים, מועצות תלמידים, תנועות נוער וכדומה.
    </p>
    <br />
    <a href="#top"><img src="Pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />
    <br />

    <h2 id="recrutments">גיוס מתנדבים מתוך האוכלוסייה</h2>
    <p>מטרתו המוצהרת של ארגון 'לב אחד' היא לגייס כמה שיותר מתנדבים ופעילים מתוך האוכלוסייה המקומית, בשאיפה להגיע ליצירת מסה קריטית של תשתית התנדבות מקומית בשעת חירום. פעולה זו הופכת את הנזקקים לאקטיביים ומעורבים, ומאפשרת להם לסייע ולהשפיע מתוך קהילתם שלהם. ההשלכות האישיות והקהילתיות של מודל זה, בעיקר בקרב בני נוער, גולשות מעבר למצבי החירום, ויוצרות חוסן חברתי ואזרחי.</p>
    <br />
    <a href="#top"><img src="Pics/backToTop.png" alt="goToTopPage" title="go back" style="width: 50px; height: 50px;" /></a>
    <hr />

</asp:Content>
