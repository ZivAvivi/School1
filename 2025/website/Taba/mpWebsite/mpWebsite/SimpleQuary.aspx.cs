using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using DbDemo_MSSite;

namespace mpWebsite
{
	public partial class WebForm3 : System.Web.UI.Page
	{
        public string st = "";
        public string msg = "";
        public string sqlSelect = "";
        public string sql = "";


        protected void Page_Load(object sender, EventArgs e)
		{
            if (Request.Form["submit"] != null)
            {
                string field = Request.Form["field"];
                string value = Request.Form["value"];

                string fileName = "usersDB.mdf";
                string tableName = "usersTbl";

                if (field == "gender" || field == "prefix")
                {
                    sqlSelect = "SELECT * FROM " + tableName + " where (" + field + " = '" + value + "');";
                }
                else
                {
                    if (field == "yearBorn")
                    {
                        sqlSelect = "SELECT * FROM " + tableName + " where (" + field + " = " + value + ");";
                    }
                    else
                    {
                        if (field == "hobby")
                        {
                            var val = int.Parse(value);
                            switch (val)
                            {
                                case 1: field = "hob1"; break;
                                case 2: field = "hob2"; break;
                                case 3: field = "hob3"; break;
                                case 4: field = "hob4"; break;
                                case 5: field = "hob5"; break;
                            }
                            sqlSelect = "SELECT * FROM " + tableName + " where (" + field + " = 'T');";
                        }
                        else
                        {
                            if (field == "email")
                                sqlSelect = "SELECT * FROM " + tableName + " where (" + field + " like '%" + value + "%');";
                            else
                                sqlSelect = "SELECT * FROM " + tableName + " where (" + field + " like N'%" + value + "');";
                        }
                    }
                }

                sql = sqlSelect;
                DataTable table = Helper.ExecuteDataTable(fileName, sqlSelect);

                int length = table.Rows.Count;

                if (length == 0)
                {
                    msg = "לא נמצאו רשומות תואמות לחפוש";
                }
                else
                {
                    st += "<tr>";
                    st += "<th style='text-align: center; border: 1px solid black; width: 100px;'>שם משתמש</th>";
                    st += "<th style='text-align: center; border: 1px solid black; width: 80px;'>שם משפחה</th>";
                    st += "<th style='text-align: center; border: 1px solid black; width: 60px;'>שם פרטי</th>";
                    st += "<th style='text-align: center; border: 1px solid black; width: 140px;'>דוא\"ל</th>";
                    st += "<th style='text-align: center; border: 1px solid black; width: 60px;'>מגדר</th>";
                    st += "<th style='text-align: center; border: 1px solid black;'>שנת לידה</th>";
                    st += "<th style='text-align: center; border: 1px solid black; width: 100px;'>קידומת-טלפון</th>";
                    st += "<th style='text-align: center; border: 1px solid black;'>computers</th>";
                    st += "<th style='text-align: center; border: 1px solid black;'>Music</th>";
                    st += "<th style='text-align: center; border: 1px solid black;'>Movies</th>";
                    st += "<th style='text-align: center; border: 1px solid black;'>TV</th>";
                    st += "<th style='text-align: center; border: 1px solid black;'>Horses</th>";
                    // st += "<th style='text-align: center; border: 1px solid black; width: 100px;'>pw</th>";
                    st += "</tr>";

                    for (int i = 0; i < length; i++)
                    {
                        st += "<tr>";
                        st += "<td style='text-align: center; border: 1px solid black;'>" + table.Rows[i]["uName"] + "</td>";
                        st += "<td style='border: 1px solid black;'>" + table.Rows[i]["fName"] + "</td>";
                        st += "<td style='border: 1px solid black;'>" + table.Rows[i]["lName"] + "</td>";
                        st += "<td style='border: 1px solid black; width: 60; text-align: left;'>" + table.Rows[i]["email"] + "</td>";
                        st += "<td style='text-align: center; border: 1px solid black;'>" + table.Rows[i]["gender"] + "</td>";
                        st += "<td style='text-align: center; border: 1px solid black;'>" + table.Rows[i]["yearBorn"] + "</td>";
                        st += "<td style='text-align: center; border: 1px solid black;'>" + table.Rows[i]["prefix"] + "-" + table.Rows[i]["phone"] + "</td>";
                        st += "<td style='text-align: center; border: 1px solid black;'>" + table.Rows[i]["hob1"] + "</td>";
                        st += "<td style='text-align: center; border: 1px solid black;'>" + table.Rows[i]["hob2"] + "</td>";
                        st += "<td style='text-align: center; border: 1px solid black;'>" + table.Rows[i]["hob3"] + "</td>";
                        st += "<td style='text-align: center; border: 1px solid black;'>" + table.Rows[i]["hob4"] + "</td>";
                        st += "<td style='text-align: center; border: 1px solid black;'>" + table.Rows[i]["hob5"] + "</td>";
                        // st += "<td style='text-align: center; border: 1px solid black;'>" + table.Rows[i]["pw"] + "</td>";
                        st += "</tr>";
                    }

                    msg = length + "אנשים עונים לתוצאת החיפוש";
                }
            }
        }
	}
}