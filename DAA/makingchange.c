#include<stdio.h>
void sortDescending(int deno[],int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(deno[i]<deno[j])
            {
               int temp=deno[i];
               deno[i]=deno[j];
               deno[j]=temp;

            }
        }

    }
}

void makeChange(int amount,int deno[],int n)
{

    sortDescending(deno,n);
    printf("Denominations in descending order: ");
    for (int i=0;i<n;i++)
    {
        printf("%d ", deno[i]);
    }
    printf("\n");
    int totalCoins=0;
    printf("Coins or bills used to make change for %d:\n", amount);
    for(int i=0;i<n;i++)
    {
        int count=0;
        while(amount>=deno[i])
        {
            amount=amount-deno[i];
            count++;
        }
        if(count>0)
        {
            printf("%d X %d\n",count,deno[i]);
            totalCoins=totalCoins+count;
        }
    }
printf("total coins:%d\n",totalCoins);
    if(amount>0)
    {
        printf("Remaining amount that cannot be made with given denominations: %d\n",amount);
    }

}
int main()
{
    int amount,n;
    printf("enter amount:");
    scanf("%d",&amount);

    printf("Enter the number of denominations: ");
    scanf("%d", &n);

    int deno[n];
    printf("Enter the denominations:\n");
    for (int i=0;i<n;i++) {
        scanf("%d", &deno[i]);
    }
    makeChange(amount, deno, n);

    return 0;
}
