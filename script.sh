# telechargement du code source depuis git 
clear
git clone https://github.com/samixchoumi/Mini_Hearstone.git
clear

# compile programme 
mkdir Mini_Hearstone/build
javac -d Mini_Hearstone/build Mini_Hearstone/src/Main.java Mini_Hearstone/src/card/FactoryCard.java Mini_Hearstone/src/card/Observable.java Mini_Hearstone/src/card/commune/*.java Mini_Hearstone/src/card/effect/*.java Mini_Hearstone/src/card/guerrier/*.java Mini_Hearstone/src/card/mage/*.java Mini_Hearstone/src/card/paladin/*.java Mini_Hearstone/src/game/*.java Mini_Hearstone/src/hero/*.java Mini_Hearstone/src/mecanique/*.java Mini_Hearstone/src/power/*.java
clear

# execute main
cd Mini_Hearstone
java -cp build/ Main