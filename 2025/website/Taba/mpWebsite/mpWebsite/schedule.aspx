<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="schedule.aspx.cs" Inherits="mpWebsite.schedule" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
    
    <style>
        table, th , td{
            border: medium;
            border-style: ridge;
            text-align: center;
            border-color: darkorange;
            
        }
    </style>

</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <center>
        <table>
            <tr>
                <th>שיעור</th>
                <th>ראשון</th>
                <th>שני</th>
                <th>שלישי</th>
                <th>רביעי</th>
                <th>חמישי</th>
                <th>שישי</th>
            </tr>

            <!--row 1-->
            <tr>
                <th>1</th>
                <td style="background-color: lightblue;" rowspan="2">מתמטיקה</td>
                <td style="background-color: mediumpurple;" rowspan="2">מדעי המחשב</td>
                <td style="background-color: palevioletred;" rowspan="2">עברית</td>
                <td style="background-color: lightgoldenrodyellow;">ספרות</td>
                <td style="background-color: coral;" rowspan="2">פיזיקה</td>
                <td style="background-color: lightgoldenrodyellow;">ספרות</td>
            </tr>

            <!--row 2-->
            <tr>
                <th>2</th>



                <td style="background-color: lightgreen;">היסטוריה</td>
                
                <td style="background-color: slategray;">חברה</td>
            </tr>

            <!--row 3-->
            <tr>
                <th>3</th>
                <td style="background-color: lightgreen;">היסטוריה</td>
                <td style="background-color: lightblue;" rowspan="2">מתמטיקה</td>
                <td style="background-color: slategray;">חברה</td>
                <td style="background-color: lightblue;" rowspan="2">מתמטיקה</td>
                <td style="background-color: palevioletred;">עברית</td>
                <td style="background-color: lightpink;" rowspan="2">אנגלית</td>
            </tr>

            <!--row 4-->
            <tr>
                <th>4</th>
                <td style="background-color: magenta;">חינוך גופני</td>

                <td style="background-color: darkolivegreen;">כלכלה</td>
                
                <td style="background-color: lightpink;">אנגלית</td>
                
            </tr>

            <!--row 5-->
            <tr>
                <th>5</th>
                <td style="background-color: brown;">תעבורה</td>
                <td style="background-color: lightgreen;">היסטוריה</td>
                <td style="background-color: lightpink;">אנגלית</td>
                <td style="background-color: mediumpurple;" rowspan="2">מדעי המחשב</td>
                <td style="background-color: lightgoldenrodyellow;">ספרות</td>
                <td></td>
            </tr>

            <!--row 6-->
            <tr>
                <th>6</th>
                <td style="background-color: coral;" rowspan="2">פיזיקה</td>
                <td style="background-color: lightgoldenrodyellow;">ספרות</td>
                <td style="background-color: magenta;">חינוך גופני</td>
                
                <td></td>
                <td></td>
            </tr>

            <!--row 7-->
            <tr>
                <th>7</th>

                <td style="background-color: lightblue;">מתמטיקה</td>
                <td style="background-color: burlywood;" rowspan="3">תב"א</td>
                <td></td>
                <td></td>
                <td></td>
            </tr>

            <!--row 8-->
            <tr>
                <th>8</th>
                <td></td>

                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <!--row 9-->
            <tr>
                <th>9</th>
                <td></td>

                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </table>
</center>
</asp:Content>
