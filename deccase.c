#include<stdio.h>  
#include<conio.h>  
int main()  
{  
    int i, f;  
    char pop[100], c;  
    printf("enter a encrypted test \t");  
    gets(pop);  
    printf("enter key \t");  
    scanf("%d", &f);  
    for(i = 0; pop[i] != '\0'; i++)  
    {  
        c = pop[i];  
        if(c >= 'a' && c <= 'z')  
        {  
            c = c - f;  
            if(c < 'a')  
            {  
                c = c + 'z' - 'a' + 1;  
            }  
            pop[i] = c;  
        }  
        else if(c >= 'A' && c < 'Z')  
        {  
            c = c + f;  
            if(c < 'A')  
            {  
                c = c + 'Z' - 'A' + 1;  
            }  
            pop[i] = c;  
        }  
    }  
    printf(" Dycrypted message: %s", pop);  
    return 0;  
}