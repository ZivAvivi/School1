using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;

namespace Final
{
    public partial class seker : System.Web.UI.Page
    {
        public string str = "";
        public string msg = "";
        public string survey = "";
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["uName"].ToString() == "אורח")
            {
                msg += "<div style='text-HorizontalAlign: center;'>";
                msg += "<h3>אינך מנהל או משתמש רשום, אין לך הראשות לצפות בדף זה</h3>";
                msg += "<a href='mainPage.aspx'>[המשך]</a>";
                msg += "</div>";
            }
            else if ((bool)Session["voted"] == true)
            {
                survey = "הנך רשאי להצביע פעם אחת בלבד";
            }
            else
            {
                if (Request.Form["send"] != null)
                {
                    Session["voted"] = true;

                    str += "<h1>תוצאות הסקר</h1>";

                    string ans = Request.Form["surv"];
                    if (ans == "1")
                        Application["q1"] = (int)Application["q1"] + 1;
                    if (ans == "2")
                        Application["q2"] = (int)Application["q2"] + 1;
                    if (ans == "3")
                        Application["q3"] = (int)Application["q3"] + 1;
                    if (ans == "4")
                        Application["q4"] = (int)Application["q4"] + 1;

                    int[] s = new int[4];

                    s[0] = (int)Application["q1"];
                    s[1] = (int)Application["q2"];
                    s[2] = (int)Application["q3"];
                    s[3] = (int)Application["q4"];

                    int width = 10;
                    double[] w = new double[4];
                    for (int i = 0; i < w.Length; i++)
                        w[i] = s[i] * width;

                    str += "s1 = " + s[0] + " , s2 = " + s[1] + " , s3 = " + s[2] + " , s4 = " + s[3] + "</ br></ br>";
                    str += "<table border = '1' dir = 'ltr'>";
                    str += "<tr><td align='center'> I </td>";
                    str += "<td width = '500'><img src='Pics/red.PNG' height='30' width = '" + w[0] + "'></td></tr>";
                    str += "<tr><td align='center'> II </td>";
                    str += "<td><img src='Pics/yellow.PNG' height='30' width='" + w[1] + "'></td></tr>";
                    str += "<tr><td align='center'> III </td>";
                    str += "<td><img src='Pics/green.PNG' height='30' width='" + w[2] + "'></td></tr>";
                    str += "<tr><td align='center'> IV </td>";
                    str += "<td><img src='Pics/blue.PNG' height='30' width='" + w[3] + "'></td></tr>";
                    str += "</table>";
                }
            }

        }
    }
}