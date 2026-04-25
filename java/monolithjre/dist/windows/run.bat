@echo off
set SCRIPT_DIR=%~dp0
"%SCRIPT_DIR%jre\bin\java.exe" -jar "%SCRIPT_DIR%app.jar" %*
