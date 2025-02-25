<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="signUp.aspx.cs" Inherits="mpWebsite.signUp" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">


<script src="Scripts/JsFunctions.js"></script>


</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <center>
        <h1>טופס רישום</h1>
        <form method="post" runat="server" onsubmit="return chkForm();" >
            <table>
                <tr>

                    <td>שם משתמש</td>
                    <td><input type="text" name="uName" id="uName" /></td>
                    <td>
                        <input type="text" id="mUName" name="mUName" size="30" style="display:none; background-color: silver; font-weight:bold;" disabled = "disabled"; />
                    </td>
                    </tr>
                    <tr>
                        <td>שם פרטי</td>
                        <td><input type="text" name="fName" id="fName" /></td>
                        <td>
                            <input type="text" id="mFName" size="30" style="display:none; background-color: silver; font-weight:bold;" disabled= "disabled"; />
                        </td>
                    </tr>
            
                    <tr>
                        <td>שם משפחה</td>
                        <td><input type="text" name="lName" id="lName" /></td>
                        <td>
                            <input type="text" id="mLName" size="30" style="display:none; background-color: silver; font-weight:bold;" disabled = "disabled"; />
                        </td>
                    </tr>
            
                    <tr>
                        <td>מייל</td>
                        <td><input type="email" name="email" id="email" /></td>
                        <td>
                            <input type="text" id="mEmail" size="30" style="display:none; background-color: silver; font-weight:bold;" disabled = "disabled"; />
                        </td>
                    </tr>
                
                    <tr>
                    <td> מגדר: </td>
                    <td><input type="radio" name="gender" value="male" checked/> זכר
                        <input type="radio" name="gender" value="female" /> נקבה
                    </td> 
                    <td></td>
                    </tr>

                    <tr>
                      <td>יישוב מגורים:</td> 
                      <td>
                        <select name="city" id="city">
                          <option value="חיפה">חיפה</option>
                          <option value="תל-אביב">תל-אביב</option>
                          <option value="ירושלים">ירושלים</option>
                          <option value="מודיעין" selected>מודיעין</option>
                          <option value="באר-שבע">באר-שבע</option>
                          <option value="מטולה">מטולה</option>
                          <option value="צפון">צפון</option>
                          <option value="מרכז">מרכז</option>
                          <option value="דרום">דרום</option>
                        </select>
                      </td>
                    </tr>

                <tr>
                    <td>מס' טלפון:</td> 
                    <td style ="direction:ltr; text-align:right;">
                        <select name="prefix">
                            <option value="050">050</option>
                            <option value="052">052</option>
                            <option value="053">053</option>
                            <option value="054">054</option>
                            <option value="055">055</option>
                            <option value="057">057</option>
                            <option value="058">058</option>
                            <option value="02">02</option>
                            <option value="03">03</option>
                            <option value="04">04</option>
                            <option value="08" selected ="selected">08</option>
                            <option value="09">09</option>
                            <option value="077">077</option>
                        </select>
                        &nbsp;&nbsp - &nbsp;&nbsp;
                        <input type="text" name="phoneNum" id="phoneNum" />
                    </td>
                    <td>
                        <input type="text" id="mPhone" size="30" style="display:none; background-color: silver; font-weight:bold;" disabled = "disabled"; />
                    </td>
                </tr>

                <tr>
                    <td>שנת לידה:</td>
                    <td> <select name="yearBorn" id="yearBorn">
                        <%= yrBorn %>
                    </select>
                    </td>
                </tr>
                
                <tr> 
                    <td>תחביבים</td>
                        <td>
                            <table style="width: 550px;">
                                <tr>
                                    <td><input type="checkbox" name="Hobies" value="1"/>Computers </td>
                                    <td><input type="checkbox" name="Hobies" value="2"/>Music </td>
                                    <td><input type="checkbox" name="Hobies" value="3" />Movies </td>
                                    <td><input type="checkbox" name="Hobies" value="4" />TV </td>
                                    <td><input type="checkbox" name="Hobies" value="5" />Horses </td>
                                </tr>
                            </table>
                        </td>
                    <td>
                    <input type="text" id="mHobies" size="30" style="display: none; background-color: Silver; font-weight:bold;" disabled="disabled" />
                    </td>
                </tr>

                <tr>
                    <td>סיסמה</td>
                    <td><input type="password" id="pw" name="pw" />
                        <span style="color: red;"> * 6-10 תווים</span></td>
                    <td>
                        <input type="text" id="mPw" size="30" style="display:none; background-color: silver; font-weight:bold;" disabled = "disabled"; />
                    </td>
                </tr>

                <tr>
                    <td>אימת סיסמה</td>
                    <td><input type="password" name="conPw" id="conPw" /></td>
                    <td>
                        <input type="text" id="mCpw" size="30" style="display:none; background-color: silver; font-weight:bold;" disabled = "disabled"; />
                    </td>
                </tr>


                <tr>
                    <td colspan ="2" style="text-align: center;">
                    <td><input type="submit" name="submit" value=" שלח " /></td>
                </tr>

            </table>

        </form>

        <%=st %>

    </center>

</asp:Content>
