const add_btn = document.getElementById("add-btn");
const clean_btn = document.getElementById("clean-btn");

let tasksList = [];

const setTasksList = array =>{
    localStorage.setItem("tasksArray", JSON.stringify(array));
}

const getTasksList = () =>{
    if (!localStorage.getItem("tasksArray")) return [];
    return JSON.parse(localStorage.getItem("tasksArray"));
}

function showTasksList(tasksList){
    const current_tasks = document.getElementById("current-tasks");
    current_tasks.innerHTML = "";

    for (const [index, element] of tasksList.entries()){
        current_tasks.innerHTML += `
            <div class="task" id="task-${index}" taskno="${index}">
                <input type="text" class="task-input" value="${element}" placeholder="Tarea nueva...">
                <button class="remove-btn material-icons">delete</button>
            </div>
        `;
    }

    for (const element of document.getElementsByClassName("task-input")){
        element.addEventListener("change", e =>{
            const id = Number.parseInt(e.target.parentElement.getAttribute("taskno"));
            const value = e.target.value;

            tasksList[id] = value;
            setTasksList(tasksList);
        });
    }

    for (const element of document.getElementsByClassName("remove-btn")){
        element.addEventListener("click", e =>{
            const id = Number.parseInt(e.target.parentElement.getAttribute("taskno"));

            tasksList.splice(id, 1);
            setTasksList(tasksList);
            showTasksList(tasksList);
        });
    }
}

document.addEventListener("DOMContentLoaded", () =>{
    tasksList = getTasksList();
    showTasksList(tasksList);
});

add_btn.addEventListener("click", () =>{
    tasksList.push("");

    setTasksList(tasksList);
    showTasksList(tasksList);
});

clean_btn.addEventListener("click", () =>{
    tasksList = [];
    setTasksList(tasksList);
    showTasksList(tasksList);
});