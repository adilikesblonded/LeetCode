1#include<stdio.h>
2#include<stdlib.h>
3
4void Insert(struct ListNode** head,int data){
5    struct ListNode* newNode=(struct ListNode*)malloc(sizeof(struct ListNode));
6    newNode->val=data;
7    newNode->next=NULL;
8    if(!(*head)){
9        *head=newNode;
10        return;
11    }
12    struct ListNode* temp=*head;
13    while(temp->next){
14        temp=temp->next;
15    }
16    temp->next=newNode;
17}
18struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
19    int carry=0;
20    struct ListNode* l3=NULL;
21    while(l1||l2||carry!=0){
22        int x=l1?l1->val:0;
23        int y=l2?l2->val:0;
24        int sum=x+y+carry;
25        Insert(&l3,sum%10);//0
26        carry=sum/10;//1
27         
28         if(l1)
29         l1=l1->next;
30         if(l2)
31         l2=l2->next;
32
33    }
34    return l3;
35}