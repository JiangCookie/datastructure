package TopK;

public class TopK {

	public static void main(String[] args) {
		// 源数据
		int[] data = {56,275,12,6,45,478,41,1236,456,12,546,45};
		
		//获取topk
		int[] top5=topk(data,5);
		for(int i=0;i<top5.length;i++){
			System.out.println(top5[i]);
		}

	}
	
	//从data数组中获取最大的K个数
	private static int[] topk(int[] data, int k) {
		int[] topk=new int[k];
		
		// 先取K个元素放入一个数组topk中
		for(int i=0;i<k;i++){
			topk[i]=data[i];
		}
		
		// 转换成最小堆
		MinHeap minHeap=new MinHeap(topk);
		
		// 从k开始，遍历data
		for (int i = k; i < data.length; i++) {
			int root=minHeap.getRoot();
			// 当数据大于堆中最小的数（根节点）时，替换堆中的根节点，再转换成堆
			if(data[i]>root)
				minHeap.setRoot(data[i]);
		}
			
		return topk;
	}

}
