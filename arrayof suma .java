#include <stdio.h>
#include <stdlib.h>

// 1. Added 'int' to specify the parameter type
int* createarray(int n) { 
    return malloc(n * sizeof(int)); 
}

// 2. Used block execution properly so the pointer moves with each scan
void getelements(int *a, int n) { 
    while(n--) { scanf("%d", a++); } 
}

void arraysum(int *a, int *b, int *s, int n) { 
    while(n--) { *s++ = *a++ + *b++; } 
}

int main() {
    int n;
    if (scanf("%d", &n) != 1) return 0;
    
    int *a = createarray(n), *b = createarray(n), *s = createarray(n);
    getelements(a, n); 
    getelements(b, n);
    
    arraysum(a, b, s, n);
    
    for (int i = 0; i < n; i++) {
        printf("%d\n", s[i]);
    }
    
    free(a); free(b); free(s);
    return 0;
}