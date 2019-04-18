var listApp = angular.module('list', ['ui.router']);
listApp.config(function ($stateProvider, $urlRouterProvider, $qProvider) {
    $qProvider.errorOnUnhandledRejections(false);
    $urlRouterProvider.otherwise('/list');
    //$urlRouterProvider.when('', '');
    $stateProvider

    /********** Services URLs **********/
        .state('list', {
            url: '/list',
            templateUrl: 'test/app/views/list.html?' + timeStamp,
        })

});
var timeStamp = Date.now();
