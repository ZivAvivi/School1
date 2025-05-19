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
            loginMsg = "<div style = 'text-align:center;'>";
            loginMsg += "<h3>שלום ";
            loginMsg += Session["userFName"];
            loginMsg += "</h3>";

            string menu = "[<a href=\"mainPage.aspx\">דף תוכן</a>]";
            menu += "[<a href=\"first.aspx\">דף ראשי</a>]";
            menu += "[<a href=\"gallery.aspx\">גלריה</a>]";
            menu += "[<a href=\"loginAdmin.aspx\">כניסת מנהל</a>]";

            if (Session["userFName"].ToString() == "אורח")
            {
                loginMsg += "<a href = 'login.aspx'>התחבר</a><br />";
                loginMsg += "<br />";
                loginMsg += "<a href = 'signUp.aspx'>הרשם</a><br />";
            } else if (Session["admin"].ToString() == "yes")
            {
                loginMsg += "<a href = 'adminPage.aspx'>דף מנהל</a><br />";
                loginMsg += "<br />";
                loginMsg += "<a href = 'logOut.aspx'>התנתק</a><br />";
                menu += "[<a href=\"seker.aspx\">סקר</a>]";
            } else
            {
                loginMsg += "<a href = 'updateUser.aspx'>עדכון פרטים</a><br />";
                loginMsg += "<br />";
                loginMsg += "<a href = 'logOut.aspx'>התנתק</a><br />";
                menu += "[<a href=\"seker.aspx\">סקר</a>]";
            }
            loginMsg += "</div>";
            menuStr = menu;
        }

        
    }
}