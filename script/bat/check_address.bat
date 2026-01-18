rem checks connection to address

cls

@echo off

rem ru
rem chcp 1251 > nul

rem en
chcp 437 > nul

set "ADDRESS=google.com"

echo --------------------------
echo checking "%ADDRESS%" start
echo --------------------------

echo ping "%ADDRESS%" ...
ping "%ADDRESS%" -n 10 -l 1000 > ping_"%ADDRESS%".txt
echo ping "%ADDRESS%" done, the results are written to the file.

echo tracert "%ADDRESS%" ...
tracert  "%ADDRESS%" > tracert_"%ADDRESS%".txt
echo tracert "%ADDRESS%" done, the results are written to the file.

echo pathping "%ADDRESS%" ...
pathping "%ADDRESS%" > pathping_"%ADDRESS%".txt
echo pathping "%ADDRESS%" done, the results are written to the file.

echo tnsping "%ADDRESS%" ...
tnsping  "%ADDRESS%" > tnsping_"%ADDRESS%".txt
echo tnsping "%ADDRESS%" done, the results are written to the file.

echo ---------------------------
echo checking "%ADDRESS%" finish
echo ---------------------------
