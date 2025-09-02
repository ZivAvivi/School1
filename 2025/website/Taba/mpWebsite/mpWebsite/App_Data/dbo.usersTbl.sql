CREATE TABLE [dbo].[usersTbl] (
    [uName]    NVARCHAR (15) NOT NULL,
    [fName]    NVARCHAR (10) NOT NULL,
    [lName]    NVARCHAR (10) NOT NULL,
    [email]    NVARCHAR (15) NOT NULL,
    [yearBorn] INT           NOT NULL,
    [gender]   NVARCHAR (6)  NOT NULL,
    [prefix]   NVARCHAR (3)  NOT NULL,
    [phone]    NVARCHAR (7)  NOT NULL,
    [city]     NVARCHAR (15) NOT NULL,
    [hob1]     NCHAR (1)     NULL,
    [hob2]     NCHAR (1)     NULL,
    [hob3]     NCHAR (1)     NULL,
    [hob4]     NCHAR (1)     NULL,
    [hob5]     NCHAR (1)     NULL,
    [pw]       NVARCHAR (15) NOT NULL,
    PRIMARY KEY CLUSTERED ([uName] ASC)
);

