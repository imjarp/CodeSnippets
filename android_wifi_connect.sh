#!/bin/bash 
echo "--Killing adb"
adb kill-server
sleep 1
echo "--Starting adb"
adb start-server
sleep 1
echo "--Android ip device"
adb shell ip -f inet addr show wlan0
sleep 1
ip=$(adb shell ip -f inet addr show wlan0 | grep -oE "\b([0-9]{1,3}\.){3}[0-9]{1,3}\b" | head -1)
sleep 1
echo "--Restarting in usb mode"
adb usb
sleep 1
adb tcpip 5555
echo "--ADB on tcpip 5555"
sleep 1
adb connect $ip:5555
echo "--Connected on " $ip
