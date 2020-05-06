#include <stdio.h>


int number = 10;
int data[10] = {1,10,5,8,7,6,4,3,2,9};

void quickSort(int* data, int start, int end){
	if(start >= end){	// 원소가 1개인 경우 그대로 두기 
		return;
	}
	
	int key = start; // 키는 첫번째 원소 
	int i = start + 1;
	int j = end;
	int temp;
	
	
	while(i <= j){	// 엇갈릴 때까지 반복
	
		// 내림차순은 while 문에 data[key] 값의 크기 비교만 바꿔주면 된다!! 
		while(i <= end && data[i] >= data[key]) {	
			i++;
		}
		while(j > start && data[j] <= data[key]){	 
			j--;
		}
		if(i > j){	// 현재 엇갈린 상태면 키 값과 교체
			temp = data[j];
			data[j] = data[key];
			data[key] = temp; 
		}else{	//엇갈리지 않았다면 i와 j를 교체 
			temp = data[i];
			data[i] = data[j];
			data[j] = temp; 
		}
		
	}
	
	quickSort(data, start, j-1);
	quickSort(data, j+1, end);
	 
}	

int main(void){
	
	quickSort(data, 0, number-1);
	
	int i;
	for(i = 0 ; i<number; i++){
		printf("%d ",data[i]);
	}
	return 0;
}
