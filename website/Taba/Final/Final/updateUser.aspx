7<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="updateUser.aspx.cs" Inherits="Final.updateUser" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
    <style>
        h1 { text-align: center; color: blueviolet; }
        h2 { text-align: center; direction: ltr; }
        h3 { text-align: center; direction: ltr; }
        td { width: 150px; }
        th { color: red; font-family: 'Guttman Yad-Brush'; }
        table { margin: 0px auto; }
        .cdHob { width: 100px; }
    </style>
    <script>
        function chkForm() {
            // בדיקת שדה שם פרטי --- שם פרטי קצר מדי או לא קיים ---//
            var fName = document.getElementById("fName").value;
            if (fName.length < 2) {
                document.getElementById("mFName").value = "שם פרטי קצר מדי או לא קיים";
                document.getElementById("mFName").style.display = "inline";
                return false;
            } else {
                document.getElementById("mFName").style.display = "none";
            }

            // בדיקת שדה שם משפחה --- שם משפחה קצר מדי או לא קיים ---//
            var lName = document.getElementById("lName").value;
            if (lName.length < 2) {
                document.getElementById("mLName").value = "שם משפחה קצר מדי או לא קיים";
                document.getElementById("mLName").style.display = "inline";
                return false;
            } else {
                document.getElementById("mLName").style.display = "none";
            }

            // בדיקת תקינות לכתובת דוא"ל ---//
            var email = document.getElementById("email").value;
            var size = email.length;
            var atSign = email.indexOf('@');
            var dotSign = email.indexOf('.', atSign);

            var msg = "";
            if (size < 6) {
                msg = "כתובת דוא\"ל קצרה מדי או לא קיימת";
            } else if (atSign == -1) {
                msg = "סימן @ לא קיים בכתובת";
            } else if (atSign != email.lastIndexOf('@')) {
                msg = "אסור יותר מ- @ אחד בכתובת דוא\"ל";
            } else if (atSign < 2 || email.lastIndexOf('@') == size - 1) {
                msg = "מיקום @ אינו יכול להיות בתחילת או בסוף הכתובת";
            } else if (email.indexOf('.') == 0 || email.lastIndexOf('.') == size - 1) {
                msg = "נקודה לא יכולה להיות בראשון או באחרון בכתובת";
            } else if (dotSign - atSign <= 1) {
                msg = "חייבת להיות לפחות 2 תווים אחרי סימן @- נקודה";
            } else if (!isQuot(email)) {
                msg = "כתובת דוא\"ל לא יכולה להכיל גרשיים";
            } else if (!isValidString(email)) {
                msg = "כתובת דוא\"ל לא יכולה להכיל תוים אסורים";
            } else if (!isHebrew(email)) {
                msg = "כתובת דוא\"ל לא יכולה להכיל עברית";
            }

            if (msg != "") {
                document.getElementById("mEmail").value = msg;
                document.getElementById("mEmail").style.display = "inline";
                return false;
            } else {
                document.getElementById("mEmail").style.display = "none";
            }

            // בדיקת מספר טלפון --- מספר הטלפון חייב להיות בן 7 ספרות ---//
            var phone = document.getElementById("phone").value;
            if (isEmpty(phone) || phone.length != 7 || isNaN(phone)) {
                msg = "מספר הטלפון חייב להיות בן 7 ספרות";
                document.getElementById("mPhone").value = msg;
                document.getElementById("mPhone").style.display = "inline";
                msg = "";
                return false;
            } else {
                document.getElementById("mPhone").style.display = "none";
            }

            // בדיקה עבור סיסמא --- הסיסמא חייבת להיות בין 6 - 8 תווים ---//
            var pw = document.getElementById("pw").value;
            var pw1 = document.getElementById("pw1").value;

            alert("pw = " + pw);

            if (pw.length < 6 || pw.length > 8) {
                msg = "הסיסמא חייבת להיות בין 6 - 8 תווים";
                document.getElementById("mPw").value = msg;
                document.getElementById("mPw").style.display = "inline";
                return false;
            } else {
                document.getElementById("mPw").style.display = "none";

                // בדיקה האם הסיסמא שווה לסיסמת האימות --- הסיסמא וסיסמת האימות אינם זהות ---//
                if (pw != pw1) {
                    msg = "הסיסמא וסיסמת האימות אינם זהות";
                    alert(msg);
                    document.getElementById("mPw1").innerHTML = msg;
                    document.getElementById("mPw1").style.display = "inline";
                    msg = "";
                    return false;
                } else {
                    document.getElementById("mPw1").style.display = "none";
                }

                alert("הטופס תקין");
                return true;
            }

            //--- אם מכיל גרש או גרשיים - לא תקין ---//
            function isQuot(mail) {
                var quot = '\'';
                var quot1 = '"';
                if (mail.indexOf(quot) != -1 || mail.indexOf(quot1) != -1)
                    return false;
                return true;
            }

            //--- מכיל תו
            function isValidString(mail) {
                var badChr = "$%^&*()-![]{}<>?";
                var len = badChr.length;

                var i = 0, pos, ch;
                while (i < len) {
                    ch = badChr.charAt(i);
                    pos = mail.indexOf(ch);
                    if (pos != -1)
                        return false;
                    i++;
                }
                return true;
            }
        
        }
    </script>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">

    <h1>עדכון פרטים אישיים</h1>
<form method="post" runat="server" onsubmit="return chkForm();">
  <table>
    <tr>
      <td>שם משתמש</td>
      <td>
        <input type="text" name="uName" disabled="disabled" value="<%= uName %>" />
      </td>
      <td></td>
    </tr>
    <tr>
      <td>שם פרטי</td>
      <td>
        <input type="text" id="fName" name="fName" value="<%= fName %>" />
      </td>
      <td>
        <input type="text" id="mFName" size="30"
               style="display: none; background-color: Silver; font-weight:bold;"
               disabled = "disabled" />
      </td>
    </tr>
    <tr>
      <td>שם משפחה</td>
      <td>
        <input type="text" id="lName" name="lName" value="<%= lName %>" />
      </td>
      <td>
        <input type="text" id="mLName" size="30"
               style="display: none; background-color: Silver; font-weight:bold;"
               disabled = "disabled" />
      </td>
    </tr>
      <tr>
      <td>כתובת דוא"ל</td>
      <td>
        <input type="text" id="email" name="email" value="<%= email %>" />
      </td>
      <td>
        <input type="text" id="mEmail" size="30"
               style="display: none; background-color: Silver; font-weight:bold;"
               disabled = "disabled" />
      </td>
    </tr>
    <tr>
      <td>מגדר</td>
      <td>
        <% if (gender == "male") { %>
          <input type="radio" name="gender" value="male" checked /> זכר
          <input type="radio" name="gender" value="female" /> נקבה
        <% } else { %>
          <input type="radio" name="gender" value="male" /> זכר
          <input type="radio" name="gender" value="female" checked /> נקבה
        <% } %>
      </td>
      <td></td>
    </tr>
          <tr>
      <td>יישוב מגורים:</td> 
      <td>
        <select name="city" id="city">
          <% if (city == "חיפה") { %>
            <option value="חיפה" selected>חיפה</option>
          <% } else { %>
            <option value="חיפה">חיפה</option>
          <% } %>
          <% if (city == "תל-אביב") { %>
            <option value="תל-אביב" selected>תל-אביב</option>
          <% } else { %>
            <option value="תל-אביב">תל-אביב</option>
          <% } %>
          <% if (city == "ירושלים") { %>
            <option value="ירושלים" selected>ירושלים</option>
          <% } else { %>
            <option value="ירושלים">ירושלים</option>
          <% } %>
          <% if (city == "מודיעין") { %>
            <option value="מודיעין" selected>מודיעין</option>
          <% } else { %>
            <option value="מודיעין">מודיעין</option>
          <% } %>
          <% if (city == "באר-שבע") { %>
            <option value="באר-שבע" selected>באר-שבע</option>
          <% } else { %>
            <option value="באר-שבע">באר-שבע</option>
          <% } %>
          <% if (city == "מטולה") { %>
            <option value="מטולה" selected>מטולה</option>
          <% } else { %>
            <option value="מטולה">מטולה</option>
          <% } %>
          <% if (city == "צפון") { %>
            <option value="צפון" selected>צפון</option>
          <% } else { %>
            <option value="צפון">צפון</option>
          <% } %>
          <% if (city == "מרכז") { %>
            <option value="מרכז" selected>מרכז</option>
          <% } else { %>
            <option value="מרכז">מרכז</option>
          <% } %>
          <% if (city == "דרום") { %>
            <option value="דרום" selected>דרום</option>
          <% } else { %>
            <option value="דרום">דרום</option>
          <% } %>
        </select>
      </td>
      <td></td>
    </tr>
      <tr>
      <td>טלפון:</td>
      <td>
        <input type="text" name="phone" id="phone" size="7" value="<%= phone %>" /> -
        <select name="prefix" id="prefix">
          <% if (prefix == "02") { %>
            <option value="02" selected>02</option>
          <% } else { %>
            <option value="02">02</option>
          <% } %>
          <% if (prefix == "03") { %>
            <option value="03" selected>03</option>
          <% } else { %>
            <option value="03">03</option>
          <% } %>
          <% if (prefix == "04") { %>
            <option value="04" selected>04</option>
          <% } else { %>
            <option value="04">04</option>
          <% } %>
          <% if (prefix == "08") { %>
            <option value="08" selected>08</option>
          <% } else { %>
            <option value="08">08</option>
          <% } %>
          <% if (prefix == "09") { %>
            <option value="09" selected>09</option>
          <% } else { %>
            <option value="09">09</option>
          <% } %>
          <% if (prefix == "050") { %>
            <option value="050" selected>050</option>
          <% } else { %>
            <option value="050">050</option>
          <% } %>
          <% if (prefix == "052") { %>
            <option value="052" selected>052</option>
          <% } else { %>
            <option value="052">052</option>
          <% } %>
          <% if (prefix == "053") { %>
            <option value="053" selected>053</option>
          <% } else { %>
            <option value="053">053</option>
          <% } %>
          <% if (prefix == "054") { %>
            <option value="054" selected>054</option>
          <% } else { %>
            <option value="054">054</option>
          <% } %>
          <% if (prefix == "055") { %>
            <option value="055" selected>055</option>
          <% } else { %>
            <option value="055">055</option>
          <% } %>
          <% if (prefix == "057") { %>
            <option value="057" selected>057</option>
          <% } else { %>
            <option value="057">057</option>
          <% } %>
          <% if (prefix == "058") { %>
            <option value="058" selected>058</option>
          <% } else { %>
            <option value="058">058</option>
          <% } %>
          <% if (prefix == "077") { %>
            <option value="077" selected>077</option>
          <% } else { %>
            <option value="077">077</option>
          <% } %>
       </select>
      </td>
      <td>
        <input type="text" name="mPhone" id="mPhone" style="display:none; background-color:Black; color:White; font-weight:bold;" disabled="disabled" />
      </td>
    </tr>
      <tr>
      <td>תחביבים</td>
      <td>
        <table style="width: 550px;">
          <tr>
            <td class="cdHob">
              <% if (hob1 == "T") { %>
                <input type="checkbox" name="hobby" value="1" checked="checked" />
              <% } else { %>
                <input type="checkbox" name="hobby" value="1" />
              <% } %>
              Computers
            </td>
            <td class="cdHob">
              <% if (hob2 == "T") { %>
                <input type="checkbox" name="hobby" value="2" checked="checked" />
              <% } else { %>
                <input type="checkbox" name="hobby" value="2" />
              <% } %>
              Music
            </td>
            <td class="cdHob">
              <% if (hob3 == "T") { %>
                <input type="checkbox" name="hobby" value="3" checked="checked" />
              <% } else { %>
                <input type="checkbox" name="hobby" value="3" />
              <% } %>
              Movies
            </td>
            <td class="cdHob">
              <% if (hob4 == "T") { %>
                <input type="checkbox" name="hobby" value="4" checked="checked" />
              <% } else { %>
                <input type="checkbox" name="hobby" value="4" />
              <% } %>
              TV
            </td>
            <td class="cdHob">
              <% if (hob5 == "T") { %>
                <input type="checkbox" name="hobby" value="5" checked="checked" />
              <% } else { %>
                <input type="checkbox" name="hobby" value="5" />
              <% } %>
              Horses
            </td>
          </tr>
        </table>
      </td>
        <td></td>
    </tr>
      <tr>
      <td>סיסמא:</td>
      <td>
        <input type="password" name="pw" id="pw" size="10" value="<%= pw %>"
               maxlength="8" />
        <span style="color: red;">*תווים 10 עד 8</span>
      </td>
      <td>
        <input type="text" name="mPw" id="mPw" style="display:none;
               background-color:Black; color:White; font-weight:bold;" disabled="disabled" />
      </td>
    </tr>
    <tr>
      <td>אימות סיסמא:</td>
      <td>
        <input type="password" name="pw1" id="pw1" size="10" value="<%= pw %>"
               maxlength="8" />
      </td>
      <td>
        <input type="text" name="mPw1" id="mPw1" style="display:none;
               background-color:Black; color:White; font-weight:bold;" disabled="disabled" />
      </td>
    </tr>
    <tr>
      <td colspan="2" style="text-align: center;">
        <input type="submit" name="submit" value="עדכן" />
      </td>
    </tr>
  </table>
</form>
    <center>
        <h2><%=msg %></h2>
        <h3 style="direction:ltr"><%=sqlSelect %></h3>
        <h3 style="direction:ltr"><%=sqlUpdate %></h3>
    </center>
    
    

    

</asp:Content>
