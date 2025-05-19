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
	public partial class loginAdmin : System.Web.UI.Page
	{
        public string msg;
        public string sqllogin;
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Request.Form["submit"] != null)
            {
                string mName = Request.Form["mName"];
                string pw = Request.Form["pw"];
                
                string fileName = "finalDB.mdf";
                string tableName = "adminTbl";

                sqllogin = "SELECT * FROM " + tableName + " WHERE mName = '" + mName + "' AND pw = '" + pw + "'";
                DataTable table = Helper.ExecuteDataTable(fileName, sqllogin);
                int length = table.Rows.Count;
                if (length == 0)
                {
                    
                    msg = "<div style='text-align: center;'>";
                    msg += "<h2>שם משתמש או סיסמה לא נכונים</h2>";
                    msg += "<a href='mainPage.aspx'>[המשך]</a>";
                    msg += "</div>";
                }
                else
                {
                    Session["userFName"] = "מנהל";
                    Session["admin"] = "yes";
                    Session["uName"] = "מנהל";
                    Response.Redirect("mainPage.aspx");
                }
            }

        }
    }
}