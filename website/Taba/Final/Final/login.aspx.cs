using System;
using System.Data;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DbDemo_MSSite;

namespace Final
{
    public partial class login : System.Web.UI.Page
    {
        public string msg = "";
        public string sqllogin;
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Request.Form["submit"] != null)
            {
                string uName = Request.Form["uName"];
                string pass = Request.Form["pw"];

                string fileName = "finalDB.mdf";
                string tableName = "usersTbl";

                sqllogin = "SELECT * FROM " + tableName + " WHERE uName = '" + uName + "' AND pw = '" + pass + "'";

                DataTable table = Helper.ExecuteDataTable(fileName, sqllogin);
                if (table.Rows.Count > 0)
                {
                    Application["counter"] = (int)Application["counter"] + 1;
                    Session["uName"] = table.Rows[0]["uName"];
                    Session["userFName"] = table.Rows[0]["fName"];
                    Response.Redirect("mainPage.aspx");
                }
                else
                {
                    msg = "<div style='text-align: center;'>";
                    msg += "<h2>שם משתמש או סיסמה לא נכונים</h2>";
                    msg += "<h3 style=\"direction:ltr\">" + sqllogin + "</h3>";
                    msg += "<a href='mainPage.aspx'>[המשך]</a>";
                    msg += "</div>";
                }
            }
        }
    }
}