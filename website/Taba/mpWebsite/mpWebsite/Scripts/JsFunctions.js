function chkForm() {
    
    var msg = "";
    var isOk = true;

    var uName = document.getElementById("uName").value;
    if (!chkUserName(uName))
        isOk = false;

    var phone = document.getElementById("phoneNum").value;
    if (chkphone(phone)) 
        isOk = false;

    var email = document.getElementById("email").value;
    if (!chkEmail(email))
        isOk = false;

    var fName = document.getElementById("fName").value;
    if (!chkName(fName, "mFName"))
        isOk = false;

    var lName = document.getElementById("lName").value;
    if (!chkName(lName, "mLName"))
        isOk = false;


    var hobies = document.getElementsByName("Hobies");
    if (!chkhobbies(hobies))
        isOk = false;

    var pw = document.getElementById("pw").value;
    var conPw = document.getElementById("conPw").value; // conPw stands for confrim password
    if (!chkPassword(pw, conPw))
        isOk = false;

    return isOk;
}

function chkUserName(txt)
{
    var msg = "";

    if (txt.length < 2)
        msg = "שם משתמש קצר מידי או לא קיים";

    if (txt.length > 30)
        msg = "שם משתמש עד 30 תווים";
    if (containsHebrew(txt))
        msg = "שם משתמש לא יכול להשתמש בעברית";
    if (isBadChars(txt))
        msg = "שם משתמש מכיל תווים אסורים";
    if (isQuot(txt))
        msg = "שם משתמש אינו יכול להכיל גרשיים";


    if (msg != "") {
        
        document.getElementById("mUName").value = msg;
        document.getElementById("mUName").style.display = "inline";
        return false;
    } else {
        document.getElementById("mUName").style.display = "none";
        return true;
    }
}

function chkEmail(email) {
    var msg = "";

    if (email.length == 0)
        msg = "אימייל לא קיים";
        mEmail
    if (email.length >= 30)
        msg = "אימייל עד 30 תווים";

    if (msg != "") {

        document.getElementById("mEmail").value = msg;
        document.getElementById("mEmail").style.display = "inline";
        return false;
    } else {
        document.getElementById("mEmail").style.display = "none";
        return true;
    }
}

function chkName(Name, mName) {
    var msg = "";

    if (Name.length < 2)
        msg = "קצר מידי או לא קיים";

    if (Name.length > 10)
        msg = "ארוך מידי עד 10 תווים";

    if (msg != "") {

        document.getElementById(mName).value = msg;
        document.getElementById(mName).style.display = "inline";
        return false;
    } else {
        document.getElementById(mName).style.display = "none";
        return true;
    }
}



function chkphone(phone) {
    if (phone.length != 7) {
        document.getElementById("mPhone").value = "מספר טלפון חייב להכיל בדיוק 7 ספרות";
        document.getElementById("mPhone").style.display = "inline";
        return false;
    }
    else 
        document.getElementById("mPhone").style.display = "none";
    

    if (isNaN(phone)) {
        document.getElementById("mPhone").value = "מספר טלפון חייב להכיל ספרות בלבד";
        document.getElementById("mPhone").style.display = "inline";
        return false;
    }
    else 
        document.getElementById("mPhone").style.display = "none";
    
}

function chkhobbies(hobies){
    var hobChecked = false;
    for (var i = 0; i < hobies.length; i++)
        if (hobies[i].checked) 
            hobChecked = true;
        
    
    if (hobChecked == false) {
        document.getElementById("mHobies").value = "לא נבחר תחביב";
        document.getElementById("mHobies").style.display = "inline";
        return false;
    } else
        document.getElementById("mHobies").style.display = "none";
        return true
}

function chkPassword(pw, conPw) {
    var msg = "";

    if (pw != conPw) 
        msg = "הסיסמה ואימות סיסמה אינם תואמים";
    
        
    if (pw.length < 6) 
        msg = "סיסמה קצרה מידי או לא קיים";
    
        
    if (pw.length > 10) 
        msg = "סיסמה עד 10 תווים";
    
        
    if (msg != "") {
        document.getElementById("mPw").value = msg;
        document.getElementById("mPw").style.display = "inline";
        return false;
    } else {
        document.getElementById("mPw").style.display = "none";
        return true;
    }
}


function containsHebrew(txt) {
    for (var i = 0; i < txt.length; i++) {
        if (txt.charAt(i) >= 'א' && txt.charAt(i) <= 'ת') {
            return true;
        }
    }
    return false;
}

function isBadChars(txt) {
    var badChar=  "~!@#$%^&*()+=-/\|[]{},?"
    for (var i = 0; i < txt.length; i++) {
        if (badChar.indexOf(txt.charAt(i)) != -1)
            return true;
    }
    return false;
}

function isQuot(txt) {
    var qout = '"', qout1 = "'";
    if (txt.indexOf(qout) != -1 || txt.indexOf(qout1) != -1)
        return true;
    return false;

}