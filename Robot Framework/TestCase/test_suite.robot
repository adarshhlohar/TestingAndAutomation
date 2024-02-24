*** Settings ***
Library     SeleniumLibrary

*** Test Cases ***
Open and Close Browser
    Open Browser    https://www.facebook.com/   Chrome
    Close Browser