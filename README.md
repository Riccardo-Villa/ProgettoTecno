# ProgettoTecno
Connessione
porta:  2003 ( sia di invio che ricezione)

peer1: 
richiesta ( annullabile dal client ):
c;NICKNAME;

peer2:
risposta:
y;NICKNAME;
n;

peer1:
conferma o annulla:
y;
n;

nel caso in cui sto aspettando la risposta dal peer2
e mi arriva una com da un altro peer
annullo di default la nuova com ( resto in attesa dell'altro ) 

Invio messaggi

se ricevo una richiesta di com
la annullo di default

m;MESSAGGIO_DA_INVIARE

Chiusura

e; 

Appena invio e; io consiero chiusa la com
se ricevo un mex da una conn chiusa
( o da una mai aperta )
invio e;
