@ECHO OFF
SET mypath=%cd%
REM @Subhradip Das,
ECHO /*--------------*/
ECHO   @Subhradip Das
ECHO /*--------------*/
ECHO Initiating "idlj" Function
PAUSE
ECHO.
idlj -fall HelloApp.idl
ECHO Package made for "HelloApp" and Java files are created,
PAUSE
ECHO.
javac HelloApp/*.java
javac *.java
ECHO.
ECHO Your Files are Compiled!
PAUSE
ECHO.
ECHO start orbd -ORBInitialPort 1050
PAUSE
ECHO.
start orbd -ORBInitialPort 1050
ECHO start java HelloServer -ORBInitialPort 1050 -ORBInitialHost localhost
PAUSE
ECHO.
start java HelloServer -ORBInitialPort 1050 -ORBInitialHost localhost
ECHO java HelloClient -ORBInitialPort 1050 -ORBInitialHost localhost
PAUSE
ECHO.
java HelloClient -ORBInitialPort 1050 -ORBInitialHost localhost
PAUSE