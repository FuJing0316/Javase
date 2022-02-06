package basic;

/**
 * @Author: fujing
 * @Date: 2022/2/6
 * @Description: Java常见的几种排序算法  https://www.cnblogs.com/ll409546297/p/10956960.html
 * @Version: 1.0
 */

/**
 * 一、所谓排序，就是使一串记录，按照其中的某个或某些关键字的大小，递增或递减的排列起来的操作。排序算法，就是如何使得记录按照要求排列的方法。
 * 排序算法在很多领域得到相当地重视，尤其是在大量数据的处理方面。一个优秀的算法可以节省大量的资源。在各个领域中考虑到数据的各种限制和规范，
 * 要得到一个符合实际的优秀算法，得经过大量的推理和分析。
 *二、排序算法可以分为内部排序和外部排序。
 * 内部排序是数据记录在内存中进行排序。
 * 外部排序是因排序的数据很大，一次不能容纳全部的排序记录，在排序过程中需要访问外存。
 *
 *  　常见的内部排序算法有：冒泡排序、选择排序、插入排序、希尔排序、快速排序、归并排序等。
 *
 *
 *
 */


public class Sort {
    public static void main(String[] args) {

        //冒泡
        bubbleSort();

        //选择排序
        selectionSort();

        //插入排序
        insertSort();


    }

    /**
     *a、默认从第二个数据开始比较。
     *b、如果第二个数据比第一个小，则交换。然后在用第三个数据比较，如果比前面小，则插入（狡猾）。否则，退出循环
     *c、说明：默认将第一数据看成有序列表，后面无序的列表循环每一个数据，如果比前面的数据小则插入（交换）。否则退出。
      */
    private static void insertSort() {
        int arr[] = {7, 5, 3, 2, 4};

        //插入排序
        for (int i = 1; i < arr.length; i++) {
            //外层循环，从第二个开始比较
            for (int j = i; j > 0; j--) {
                //内存循环，与前面排好序的数据比较，如果后面的数据小于前面的则交换
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    //如果不小于，说明插入完毕，退出内层循环
                    break;
                }
            }
        }
    }

    /**
     * a、将第一个值看成最小值
     * b、然后和后续的比较找出最小值和下标
     * c、交换本次遍历的起始值和最小值
     * d、说明：每次遍历的时候，将前面找出的最小值，看成一个有序的列表，后面的看成无序的列表，然后每次遍历无序列表找出最小值。
     */
    private static void selectionSort() {
        int arr[] = {6, 5, 3, 2, 4};

        //选择
        for (int i = 0; i < arr.length; i++) {
            //默认第一个是最小的。
            int min = arr[i];
            //记录最小的下标
            int index = i;
            //通过与后面的数据进行比较得出，最小值和下标
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            //然后将最小值与本次循环的，开始值交换
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
            //说明：将i前面的数据看成一个排好的队列，i后面的看成一个无序队列。每次只需要找无需的最小值，做替换
        }
    }


    /**
     * a、冒泡排序，是通过每一次遍历获取最大/最小值
     * b、将最大值/最小值放在尾部/头部
     * c、然后除开最大值/最小值，剩下的数据在进行遍历获取最大/最小值
     * d、代码实现
     */
    private static void bubbleSort() {
        int arr[] = {8, 5, 3, 2, 4};

        for (int i = 0; i < arr.length; i++) {
            //外层循环，遍历次数
            for (int j = 0; j < arr.length - i - 1; j++) {
                //内层循环，升序（如果前一个值比后一个值大，则交换）
                //内层循环一次，获取一个最大值
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }







}
