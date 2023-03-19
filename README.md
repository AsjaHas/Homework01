1. Napravite repozitorij “zadaca1”
2. Klonirajte taj repozitorij.
3. Zatim cete otvoriti intelij
4. Ici cete na ‘File’ -> ‘New’ -> ‘Project’
5. Setujte ime ‘zadaca1’
6. Location setujte path unutar kloniranog repozitorij-a.
   npr. Ako je vas repozitorij u c:\workspace\zadaca1 onda ga stavite tu.
   inace je praksa da svi projekti budu u nekom “workspace” folderu.
7. Kliknite ‘Create’
8. Ukoliko zelite da pokrenete projekat najlaksi nacin je da idete:
   ‘vasProjekat’ u browseru intellij sa lijeve strane -> ‘src’ folder
9. Main klasa koja sadrzi ' public static void main’ metodu
10. Desni klick na ' public static void main’ metodu i izaberite -> Run ‘Main.main’
11. Od tog trenutka mozete da pokrecete projekat sa onim malim play dugmetom

Zadaca:
1. Napravit cete readme.md file koji sadrzi zadatke koje sam vam zadao. Ovo mozete preko intelij ne terminala.
2. readme.md fajl se treba nalaziti u samom folderu zadaca1
3. Kada zavrsite sve uradite

git add .

i pushajte vas kod na repozitorij 
4. Probajte da dodjelite jednu varijablu jednog tipa u drugu varijablu drugog tipa i zakljucite koje kombinacije se ne mogu dodjeljivati jedne u druge npr :

String someText = "Some random text"
int someNumber = someText;

Pogledajte koju gresku javlja i zasto vam javlja gresku.
Zatim zakomentarisite obje linije koda.
5. Deklarisati varijable za: Ime i prezime, prvo slovo imena, godina rodjenja, broj 100 000 000 000, broj 42.001
imena moraju biti smislena i na engleskom.
6. 6.Isprintate vase ime koristeci samo brojeve  koji se pretvore u char-ove.
7. napravite vaijablu koju kad ispisete ispise tekst:
Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42: true
ili
Answer to the Ultimate Question of Life, the Universe, and Everything is the number 42: false
8. Zelim da mi napisete program koji ce poceti sa tekstom:
This is a number xxx and it is about to double;
I zatim 8 puta da se udupla njegova vrijednost i svaki put da se isti tekst ispise
sa uduplanim brojem. PRvi put kad se ispise broj mora biti izvorno upisani broj.   xxx je neki broj koji mogu ja sam da dodam a da se ne narusi logika.   BONUS: (ko zeli)
Da se za svako duplanje ispise poruka nakon glavnog teksta
The original number has been doubled: XXXX times. (Za 4 duplanja)
The original number has been doubled: X times. (Za 1 duplanje)
The original number has been doubled: XXXXXXXX times. (Za 8 duplanja)
