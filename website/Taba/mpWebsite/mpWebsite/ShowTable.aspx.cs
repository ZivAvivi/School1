﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

using System.Data;
using DbDemo_MSSite;

namespace mpWebsite
{
    public partial class ShowTable : System.Web.UI.Page
    {
        public string st = "";
        public string msg = "";
        public string sqlSelect = "";

        protected void Page_Load(object sender, EventArgs e)
        {
            string fileName = "usersDB.mdf";
            string tableName = "usersTBL";
            sqlSelect = "SELECT * FROM " + tableName;

            DataTable table = Helper.ExecuteDataTable(fileName, sqlSelect);

            int length = table.Rows.Count;
            if (length == 0)
                msg = "no users";
            else
            {
                st += "<tr>";
                st += "<th class = 'tblTH' style = 'width: 100px;'>שם משתמש</th>";
                st += "<th class = 'tblTH' style = 'width: 80px;'>שם משפחה</th>";
                st += "<th class = 'tblTH' style = 'width: 60px;'>שם פרטי</th>";
                st += "<th class = 'tblTH' style = 'width: 140px;'>דואל</th>";
                st += "<th class = 'tblTH' style = 'width: 60px;'>מגדר</th>";
                st += "<th class = 'tblTH' style = 'width: 100px;'>ישוב מגורים</th>";
                st += "<th class = 'tblTH'>שנת לידה</th>";
                st += "<th class = 'tblTH' style = 'width: 100px;'>טלפון</th>";
                st += "<th class = 'tblTH'>computers</th>";
                st += "<th class = 'tblTH'>music</th>";
                st += "<th class = 'tblTH'>movies</th>";
                st += "<th class = 'tblTH'>TV</th>";
                st += "<th class = 'tblTH'>Horses</th>";
                st += "<th class = 'tblTH' style = 'width: 100px;'>סיסמה</th>";
                st += "</tr>";

                for (int i = 0; i < length; i++)
                {
                    st += "<tr>";
                    st += "<td class = 'tblTD1'>" + table.Rows[i]["uName"] + "</td>";
                    st += "<td class = 'tblTD2'>" + table.Rows[i]["IName"] + "</td>";
                    st += "<td class = 'tblTD2'>" + table.Rows[i]["fName"] + "</td>";
                    st += "<td class = 'tblTD3' style= 'width: 60px;'>" + table.Rows[i]["email"] + "</td>";
                    st += "<td class = 'tblTD1'>" + table.Rows[i]["gender"] + "</td>";
                    st += "<td class = 'tblTD2'>" + table.Rows[i]["city"] + "</td>";
                    st += "<td class = 'tblTD1'>" + table.Rows[i]["yearBorn"] + "</td>";
                    st += "<td class = 'tblTD1'>" + table.Rows[i]["prefix"] + " - " + table.Rows[i]["phone"] + "</td>";
                    st += "<td class = 'tblTD1'>" + table.Rows[i]["hob1"] + "</td>";
                    st += "<td class = 'tblTD1'>" + table.Rows[i]["hob2"] + "</td>";
                    st += "<td class = 'tblTD1'>" + table.Rows[i]["hob3"] + "</td>";
                    st += "<td class = 'tblTD1'>" + table.Rows[i]["hob4"] + "</td>";
                    st += "<td class = 'tblTD1'>" + table.Rows[i]["hob5"] + "</td>";
                    st += "<td class = 'tblTD1'>" + table.Rows[i]["pw"] + "</td>";
                    st += "</tr>";

                }
                msg = "נרשמו: " + length + "אנשים";

            }


        }
    }
}