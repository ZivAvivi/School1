function chkForm() {
    
    var msg = "";

    var uName = document.getElementById("uName").value;

        if (!chkUserName(uName)) {
        return false;
    }
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