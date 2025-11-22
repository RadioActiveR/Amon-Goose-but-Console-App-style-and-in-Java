@echo off
cls
echo Compiling...
javac AmonGooseGame.java
if errorlevel 1 (
    echo Compilation failed.
    pause
    exit /b
)

echo Running...
java AmonGooseGame

echo.
pause
