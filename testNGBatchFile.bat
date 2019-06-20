set projectLocation=https://github.com/himanshi2626/SlideTeamFormsAuto
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause
