/*Scrivere un programma che, richiesti in ingresso due valori interi distinti, ne stampi a schermo il minore.*/




#include<stdio.h>
int main ()
{ 
int n1;
int n2;

printf("inserisci il primo numero");
scanf("%d",& n1);

printf("inserisci il secondo numero ");
scanf("%d",& n2);

if(n1<n2)

  { printf ("%d",n1);
  }
else 
  { printf("%d",n2);
  }
return 0;
}

