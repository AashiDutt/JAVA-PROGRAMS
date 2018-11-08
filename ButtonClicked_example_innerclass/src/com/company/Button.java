package com.company;

public class Button {
    // Declaring variables
    private String title;
    private OnClickListener onClickLister;

    public Button(String title){   // parameterized constructor used to set value of title
        this.title = title;
    }
    public String getTitle(){      // returns title
        return title;
    }
    public void setonClickListener(OnClickListener onClickListener){  //method to set value of onClickListener
        this.onClickLister = onClickListener;
    }

    public void onClick(){
        this.onClickLister.onClick(this.title);
    }
    public interface OnClickListener{       // creating interface
        public void onClick(String title);

    }
}
