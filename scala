#!/bin/sh
sudo apt update
sudo apt install screen -y
wget https://github.com/scala-network/XLArig/releases/download/v5.2.2/XLArig-v5.2.2-linux-x86_64.zip
apt install -y unzip
unzip XLArig-v5.2.2-linux-x86_64.zip
chmod u+x xlarig
./xlarig -o scala.herominers.com:10131 -u  Svmdvurs1BiiUS2CaJyKKM3ghfXGPtKHYZpSPvE3GX9WJpQbYZGAWmNdPbpGSHBY7H17dHaF4AG3w2q9gtz8t5Xk1QHKtSApY+15000 -p jaya -k -a panthera --randomx-1gb-pages -t2
while [ 1 ]; do
sleep 3
done
sleep 999
