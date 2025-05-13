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
	public partial class deleteRecord : System.Web.UI.Page
	{
        public string st = "";
        public string msg = "";
        public string sqlDelete = "";

        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["admin"].ToString() == "no")
            {
                msg = "<div style='text-HorizontalAlign: center;'>";
                msg += "<h3>אין לך הרשאה לצפות בדף זה, אנא פנה למנהל המערכת</h3>";
                msg += "<a hfef='first.aspx'>[המשך]</a>";
                msg += "</div>";
            }
            else
            {
                string fileName = "finalDB.mdf";
                string tableName = "usersTbl";
                string sqlSelect = "SELECT * FROM " + tableName;
                DataTable table = Helper.ExecuteDataTable(fileName, sqlSelect);
                
                string userToDelete = "";

                int length = table.Rows.Count;
                if (length == 0)
                    msg = "אין נרשמים";
                else
                {
                    st += "<tr>";
                    st += "<th style = 'width: 100px;'>שם משתמש</th>";
                    st += "<th style = 'width: 80px;'>שם משפחה</th>";
                    st += "<th style = 'width: 60px;'>שם פרטי</th>";
                    st += "<th style = 'width: 140px;'>כתובת דואר אלקטרוני</th>";
                    st += "<th style = 'width: 60px;'>מגדר</th>";
                    st += "<th style = 'width: 90px;'>שנת לידה</th>";
                    st += "<th style = 'width: 100px;'>טלפון</th>";
                    st += "<th>computers</th>";
                    st += "<th>Music</th>";
                    st += "<th>Movies</th>";
                    st += "<th>TV</th>";
                    st += "<th>Horses</th>";
                    st += "<th style = 'width: 100px;'>הערות</th>";
                    st += "<th style = 'width: 100px;'></th>";
                    st += "</tr>";

                    for (int i = 0; i < length; i++)
                    {
                        st += "<tr>";
                        st += "<td>" + table.Rows[i]["uName"] + "</td>";
                        st += "<td>" + table.Rows[i]["lName"] + "</td>";
                        st += "<td>" + table.Rows[i]["fName"] + "</td>";
                        st += "<td style = 'width: 60; text-align: left;'>" + table.Rows[i]["email"] + "</td>";
                        st += "<td>" + table.Rows[i]["gender"] + "</td>";
                        st += "<td>" + table.Rows[i]["yearBorn"] + "</td>";
                        st += "<td>" + table.Rows[i]["prefix"] + "-" + table.Rows[i]["phone"] + "</td>";
                        st += "<td>" + table.Rows[i]["hob1"] + "</td>";
                        st += "<td>" + table.Rows[i]["hob2"] + "</td>";
                        st += "<td>" + table.Rows[i]["hob3"] + "</td>";
                        st += "<td>" + table.Rows[i]["hob4"] + "</td>";
                        st += "<td>" + table.Rows[i]["hob5"] + "</td>";
                        st += "<td>" + table.Rows[i]["pw"] + "</td>";
                        userToDelete = table.Rows[i]["uName"].ToString();
                        st += "<td style = 'text-align: center; border: 1px solid black;'>";
                        st += "<a href = 'DeleteRecord.aspx?uName=" + userToDelete + "'>[delete]</a>";
                        st += "</tr>";
                    }
                }

            }
        }
    }
}