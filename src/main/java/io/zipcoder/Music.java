package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer goalIndex = 0;
        for (int i=0; i<playList.length; i++){
            if (playList[i].equals(selection)){
                goalIndex = i;
            }
        }
        if (goalIndex - startIndex < 3){
            return goalIndex - startIndex;
        } else {
            return playList.length - (goalIndex - startIndex);
        }
    }
}
