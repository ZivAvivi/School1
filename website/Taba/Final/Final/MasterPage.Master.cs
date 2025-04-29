using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Final
{
    public partial class MasterPage : System.Web.UI.MasterPage
    {
        public string myTime;
        public string loginMsg;
        public string menuStr = "";
        protected void Page_Load(object sender, EventArgs e)
        {

            myTime = DateTime.Now.ToString();
            loginMsg = "<h3>שלום ";
            loginMsg += Session["userFName"];
            loginMsg += "</h3>";

            string menu = "[<a href=\"mainPage.aspx\">דף הבית</a>]";
            menu += "[<a href=\"gallery.aspx\">גלריה</a>]";
            menu += "[<a href=\"loginAdmin.aspx\">התחבר מנהל</a>]";

            if (Session["userFName"].ToString() == "אורח")
            {
                loginMsg += "<a href = 'login.aspx'>התחבר</a><br />";
                loginMsg += "<a href = 'signUp.aspx'>הרשם</a><br />";
            } else if (Session["admin"].ToString() == "yes")
            {
                loginMsg += "<a href = 'adminPage.aspx'>דף מנהל</a><br />";
                loginMsg += "<a href = 'logOut.aspx'>התנתק</a><br />";
            } else
            {
                loginMsg += "<a href = 'update.aspx'>עדכון פרטים</a><br />";
                loginMsg += "<a href = 'logOut.aspx'>התנתק</a><br />";
            }   
            menuStr = menu;
        }

        
    }
}