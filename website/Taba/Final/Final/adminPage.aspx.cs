using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Final
{
	public partial class adminPage : System.Web.UI.Page
	{
        public string msg = "";
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["admin"].ToString() == "no")
            {
                msg = "<div align = center><h3>";
                msg += "אינך מנהל, אין לך הרשאות להיכנס לדף ניהול";
                msg += "</h3>";
                msg += "[<a href = 'First.aspx'>חזור</a>]";
                msg += "</div>";
            }
            else
            {
                msg += "<center>";
                msg += "<h1>דף מנהל</h1>";
                msg += "<h2>";
                msg += "<a href=\"showTable.aspx\">טבלת משתמשים</a>";
                msg += "<h2>";
                msg += "<h2>";
                msg += "<a href=\"simpleQuary\">שאילטה פשוטה</a>";
                msg += "<h2>";
                msg += "</center>";
            }
        }
    }
}