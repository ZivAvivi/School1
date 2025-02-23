using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace mpWebsite
{
    public partial class signUp : System.Web.UI.Page
    {
        public string yrBorn = "";
        public string st = "";

        
        protected void Page_Load(object sender, EventArgs e)
        {
            

            if (Request.Form["submit"] != null) 
            {

                st += "<table dir = 'ltr' border = '1'>";
                st += "<tr><th colspan='2'>הפרטים שהתקבלו</th></tr>";

                string uName = Request.Form["uName"];
                string fName = Request.Form["fName"];
                string lName = Request.Form["lName"];
                string mail = Request.Form["email"];
                string gender = Request.Form["gender"];
                string prefix = Request.Form["prefix"];
                string phone = Request.Form["phoneNum"];
                string city = Request.Form["city"];
                string yearBorn = Request.Form["yearBorn"];
                string hobies = Request.Form["Hobies"];

                char hob1 = 'F';
                char hob2 = 'F';
                char hob3 = 'F';
                char hob4 = 'F';
                char hob5 = 'F';

                if (hobies != null)
                {
                    hobies = Request.Form["Hobies"].ToString();

                    if (hobies.Contains('1')) hob1 = 'T';
                    if (hobies.Contains('2')) hob2 = 'T';
                    if (hobies.Contains('3')) hob3 = 'T';
                    if (hobies.Contains('4')) hob4 = 'T';
                    if (hobies.Contains('5')) hob5 = 'T';
                }

                string pw = Request.Form["pw"];


                st += "<tr><td>user name: </td><td>" + uName + "</td></tr>";
                st += "<tr><td>first name: </td><td>" + fName + "</td></tr>";
                st += "<tr><td>last name: </td><td>" + lName + "</td></tr>";
                st += "<tr><td>email: </td><td>" + mail + "</td></tr>";
                st += "<tr><td>gender: </td><td>" + gender + "</td></tr>";
                st += "<tr><td>city: </td><td>" + city + "</td></tr>";
                st += "<tr><td> phone: </td>";
                st += "<td align = 'center'>" + prefix + " - " + phone + "</td></tr>";
                st += "<tr><td>year born: </td><td>" + yearBorn + "</td></tr>";
                st += "<tr><td>hobbies: </td><td>";
                if (hob1 == 'T')
                    st += "computers, ";
                if (hob2 == 'T')
                    st += "Music, ";
                if (hob3 == 'T')
                    st += "Movies, ";
                if (hob4 == 'T')
                    st += "TV, ";
                if (hob5 == 'T')
                    st += "Horses";
                st += "</td></tr>";
                st += "<tr><td>password: </td><td>" + pw + "</td></tr>";



                st += "</table>";
            }
            


            //------ יצירת מחרוזת לשנת לידה ------//
            int year = DateTime.Now.Year;
            int from = year - 30;
            int to = year - 10;

            //--- הצגת כל השנים בתחום ---//
            int selectedYear = year - 16;
            for (int y = from; y < to; y++)
            {
                if (y == selectedYear)
                    yrBorn += $"<option value = '{y}' selected>{y}</option>";
                else
                    yrBorn += "<option value = '" + y + "'>" + y + "</option>";
            }
        }
    }
}