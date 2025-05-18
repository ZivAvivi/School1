using DbDemo_MSSite;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Final
{
    public partial class updateUser : System.Web.UI.Page
    {
        public string msg = "";
        public string sqlUpdate = "";
        public string sqlSelect = "";

        public string yrBorn = "";
        public string uName, fName, lName, email, prefix, phone, gender, pw, city;
        public string hob1, hob2, hob3, hob4, hob5;

        protected void Page_Load(object sender, EventArgs e)
        {
            string fileName = "finalDB.mdf";
            uName = Session["uName"].ToString();

            if (uName == "אורח")
            {
                msg = "אינך משתמש רשום במערכת";
                Response.Redirect("first.aspx");
            }
            else
            {
                //----- שליפת פרטי המשתמש מטבלת הנתונים -----//
                sqlSelect = "SELECT * FROM usersTbl WHERE uName = '" + uName + "'";
                DataTable table = Helper.ExecuteDataTable(fileName, sqlSelect);

                //----- בדיקה: האם המשתמש קיים במערכת ? -----//
                int length = table.Rows.Count;
                if (length == 0)
                    msg = "אינך משתמש רשום במערכת";
                else
                {
                    //----- שליפת הנתונים מהרשומה -----//
                    fName = table.Rows[0]["fName"].ToString().Trim(); // ללא תווי רווח
                    lName = table.Rows[0]["lName"].ToString().Trim();
                    email = table.Rows[0]["email"].ToString().Trim();
                    prefix = table.Rows[0]["prefix"].ToString().Trim();
                    phone = table.Rows[0]["phone"].ToString().Trim();
                    gender = table.Rows[0]["gender"].ToString().Trim();
                    city = table.Rows[0]["city"].ToString().Trim();
                    int yearBorn = Convert.ToInt16(table.Rows[0]["yearBorn"]);
                    hob1 = table.Rows[0]["hob1"].ToString().Trim();
                    hob2 = table.Rows[0]["hob2"].ToString().Trim();
                    hob3 = table.Rows[0]["hob3"].ToString().Trim();
                    hob4 = table.Rows[0]["hob4"].ToString().Trim();
                    hob5 = table.Rows[0]["hob5"].ToString().Trim();
                    pw = table.Rows[0]["pw"].ToString().Trim();
                }
                if (IsPostBack)
                {
                    fName = Request.Form["fName"];
                    lName = Request.Form["lName"];
                    email = Request.Form["email"];
                    prefix = Request.Form["prefix"];
                    phone = Request.Form["phone"];
                    gender = Request.Form["gender"];
                    pw = Request.Form["pw"];
                    city = Request.Form["city"];

                    // טיפול בהעדפות תחביבים
                    string hobby = Request.Form["hobby"].ToString(); // אוסף תחביבים שסומנו

                    hob1 = "F";
                    hob2 = "F";
                    hob3 = "F";
                    hob4 = "F";
                    hob5 = "F";

                    // בדיקה: האם התחביב מכיל את הערכים
                    if (hobby.Contains("1")) hob1 = "T";
                    if (hobby.Contains("2")) hob2 = "T";
                    if (hobby.Contains("3")) hob3 = "T";
                    if (hobby.Contains("4")) hob4 = "T";
                    if (hobby.Contains("5")) hob5 = "T";

                    // בניית שאילתת העדכון
                    sqlUpdate = "UPDATE usersTbl SET ";
                    sqlUpdate += "fName = N'" + fName + "', ";
                    sqlUpdate += "lName = N'" + lName + "', ";
                    sqlUpdate += "email = '" + email + "', ";
                    sqlUpdate += "prefix = '" + prefix + "', ";
                    sqlUpdate += "phone = '" + phone + "', ";
                    sqlUpdate += "gender = '" + gender + "', ";
                    sqlUpdate += "hob1 = '" + hob1 + "', ";
                    sqlUpdate += "hob2 = '" + hob2 + "', ";
                    sqlUpdate += "hob3 = '" + hob3 + "', ";
                    sqlUpdate += "hob4 = '" + hob4 + "', ";
                    sqlUpdate += "hob5 = '" + hob5 + "', ";
                    sqlUpdate += "pw = '" + pw + "' ";
                    sqlUpdate += "WHERE uName = '" + uName + "'";

                    // הפעלת שאילתת העדכון
                    Helper.DoQuery(fileName, sqlUpdate);

                    msg = "עודכן בהצלחה"; //----- הודעה שתוצג בצד הלקוח -----//

                }
            }
        }
    }
}