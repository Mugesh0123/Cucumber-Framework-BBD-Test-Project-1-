@REM
@REM   Maven Wrapper
@REM
@REM   Licensed to the Apache Software Foundation (ASF)
@REM

@echo off
setlocal enabledelayedexpansion

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%

@REM Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@REM Add default JVM options here. You can also use JAVA_OPTS and MAVEN_OPTS to pass JVM options to this wrapper.
set DEFAULT_JVM_OPTS=

@REM Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >nul 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%\bin\java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@REM Get command-line arguments, handling Windowz variants
set CMD_LINE_ARGS=%*

@REM Find the project base dir, i.e. the directory that contains the top level pom.xml.
set EXEC_DIR=%CD%
set WDIR=%EXEC_DIR%
:findBaseDir
if exist "%WDIR%\pom.xml" goto baseDirFound
cd ..
if "%CD%"=="%WDIR%" goto baseDirNotFound
set WDIR=%CD%
goto findBaseDir

:baseDirFound
set MAVEN_PROJECTBASEDIR=%WDIR%
cd /d "%MAVEN_PROJECTBASEDIR%"
goto endDetectBaseDir

:baseDirNotFound
set MAVEN_PROJECTBASEDIR=%EXEC_DIR%
cd /d "%EXEC_DIR%"

:endDetectBaseDir

if not exist "%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.jar" (
    echo Downloading maven-wrapper.jar from https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar
    powershell -Command "&{'(new-object System.Net.WebClient).DownloadFile(''https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar'', ''%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.jar'')'}"
    if "%ERRORLEVEL%" == "0" (
        echo Downloaded successfully
    ) else (
        echo Failed to download maven-wrapper.jar
        goto fail
    )
)

if not exist "%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\MavenWrapperDownloader.java" (
    echo Downloading MavenWrapperDownloader.java
)

%JAVA_EXE% ^
  -classpath "%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.jar" ^
  org.apache.maven.wrapper.MavenWrapperMain ^
  %CMD_LINE_ARGS%

if "%ERRORLEVEL%" == "0" goto endMvnw
goto fail

:endMvnw
endlocal & exit /b 0

:fail
endlocal & exit /b 1
