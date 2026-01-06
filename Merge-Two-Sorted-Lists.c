1/**
2 * Definition for singly-linked list.
3 * struct ListNode {
4 *     int val;
5 *     struct ListNode *next;
6 * };
7 */
8struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
9    if(!list1)return list2;
10    if(!list2)return list1;
11    struct ListNode* head;
12    struct ListNode* curr;
13    //attach the first Node
14    if(list1->val<list2->val){
15        head=curr=list1;//initialize head and current nodes
16        list1=list1->next;
17    }
18    else{
19        head=curr=list2;
20        list2=list2->next;
21    }
22    while(list1!=NULL && list2!=NULL){
23        if(list1->val<list2->val){
24            curr->next=list1;
25            list1=list1->next;
26        }
27        else{
28            curr->next=list2;
29            list2=list2->next;
30        }
31        curr=curr->next;
32    }
33    //attach remaining nodes
34    curr->next=list1?list1:list2;
35    return head;
36}