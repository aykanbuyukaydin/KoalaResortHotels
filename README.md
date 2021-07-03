# KoalaResortHotels

Github a kodlarımızı takım halinde hata almadan çalışabilmek adına dipnotlar ....

1)Öncelikle ij de frameworkuzu açtığımızda ilk olarak terminal a gidip 
       * git checkout master
       * git branch (master a gectigimzi kontrol amacli yapilabilir)
       * git pull  
   (git pull dedigimizde hata alıyorsak eger bizim kendi branch mizde guncel yazdigimiz kodlari githuba yuklememisiz demektir) o yuzden once;
       * git checkout branchismimiz
       * git branch (kendi branch mize gectigimzi kontrol amacli yapilabilir)
       * git add .
       * git commit -m "mesajim"
       * git push
   (simdi artik master branch e gecebilirim)
       * git checkout master
       * git branch (master a gectigimzi kontrol amacli yapilabilir)
       * git pull
2)Masterdan githubdaki güncel kodlari aldık ve artik kendi branch e gidip masterdaki kodlari kendi branch e çekmeliyim
       * git checkout branchismimiz
       * git branch (kendi branch mize gectigimzi kontrol amacli yapilabilir)
       * git merge master
3)Branch mizde kodlari birlestirdik artik framework mizde kodlarizi yazabiliriz
4)Kodlarimizi yazdiktan sonra githuba gondermek icin
        * git add .
        * git commit -m "mesajim"
        * git push
   (kodlarimizi gonderip gondermedigimzi anlamak amacli git status diyip kontrol edebiliriz)
   
                                  githubdan kodlari cekmek icin tekrar bastaki adimlari takip ederiz bu dongu bu sekilde devam eder ...

NOT: Kodlari github dan cekmek icin master da, kod yazacaksak kendi branch mizde oldugumuzdan emin olalim .. .
Not: Kodlarimizi yazdiktan sonra komutlara gecmeden once save all yaptigimizdan emin olalım .. 
