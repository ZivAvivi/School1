using DbDemo_MSSite;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Final
{
	public partial class deleteRecord1 : System.Web.UI.Page
	{
		protected void Page_Load(object sender, EventArgs e)
		{
            string fileName = "finalDB.mdf";
            if (Session["admin"].ToString() == "yes")
            {
                string uName = Request.QueryString["uName"].ToString();
                string sqlDelete = "DELETE FROM usersTbl WHERE uName = '" + uName + "'";
                Helper.DoQuery(fileName, sqlDelete);
            }

            Response.Redirect("deleteUser.aspx");
        }
	}
}