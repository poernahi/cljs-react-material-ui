(ns cljs-react-material-ui.icons
  (:require [cljs-react-material-ui.core :as m]))

(def tags
  '[
    ActionAccessibility
    ActionAccessible
    ActionAccountBalanceWallet
    ActionAccountBalance
    ActionAccountBox
    ActionAccountCircle
    ActionAddShoppingCart
    ActionAlarmAdd
    ActionAlarmOff
    ActionAlarmOn
    ActionAlarm
    ActionAllOut
    ActionAndroid
    ActionAnnouncement
    ActionAspectRatio
    ActionAssessment
    ActionAssignmentInd
    ActionAssignmentLate
    ActionAssignmentReturn
    ActionAssignmentReturned
    ActionAssignmentTurnedIn
    ActionAssignment
    ActionAutorenew
    ActionBackup
    ActionBook
    ActionBookmarkBorder
    ActionBookmark
    ActionBugReport
    ActionBuild
    ActionCached
    ActionCameraEnhance
    ActionCardGiftcard
    ActionCardMembership
    ActionCardTravel
    ActionChangeHistory
    ActionCheckCircle
    ActionChromeReaderMode
    ActionClass
    ActionCode
    ActionCompareArrows
    ActionCopyright
    ActionCreditCard
    ActionDashboard
    ActionDateRange
    ActionDeleteForever
    ActionDelete
    ActionDescription
    ActionDns
    ActionDoneAll
    ActionDone
    ActionDonutLarge
    ActionDonutSmall
    ActionEject
    ActionEuroSymbol
    ActionEventSeat
    ActionEvent
    ActionExitToApp
    ActionExplore
    ActionExtension
    ActionFace
    ActionFavoriteBorder
    ActionFavorite
    ActionFeedback
    ActionFindInPage
    ActionFindReplace
    ActionFingerprint
    ActionFlightLand
    ActionFlightTakeoff
    ActionFlipToBack
    ActionFlipToFront
    ActionGTranslate
    ActionGavel
    ActionGetApp
    ActionGif
    ActionGrade
    ActionGroupWork
    ActionHelpOutline
    ActionHelp
    ActionHighlightOff
    ActionHistory
    ActionHome
    ActionHourglassEmpty
    ActionHourglassFull
    ActionHttp
    ActionHttps
    ActionImportantDevices
    ActionInfoOutline
    ActionInfo
    ActionInput
    ActionInvertColors
    ActionLabelOutline
    ActionLabel
    ActionLanguage
    ActionLaunch
    ActionLightbulbOutline
    ActionLineStyle
    ActionLineWeight
    ActionList
    ActionLockOpen
    ActionLockOutline
    ActionLock
    ActionLoyalty
    ActionMarkunreadMailbox
    ActionMotorcycle
    ActionNoteAdd
    ActionOfflinePin
    ActionOpacity
    ActionOpenInBrowser
    ActionOpenInNew
    ActionOpenWith
    ActionPageview
    ActionPanTool
    ActionPayment
    ActionPermCameraMic
    ActionPermContactCalendar
    ActionPermDataSetting
    ActionPermDeviceInformation
    ActionPermIdentity
    ActionPermMedia
    ActionPermPhoneMsg
    ActionPermScanWifi
    ActionPets
    ActionPictureInPictureAlt
    ActionPictureInPicture
    ActionPlayForWork
    ActionPolymer
    ActionPowerSettingsNew
    ActionPregnantWoman
    ActionPrint
    ActionQueryBuilder
    ActionQuestionAnswer
    ActionReceipt
    ActionRecordVoiceOver
    ActionRedeem
    ActionRemoveShoppingCart
    ActionReorder
    ActionReportProblem
    ActionRestorePage
    ActionRestore
    ActionRoom
    ActionRoundedCorner
    ActionRowing
    ActionSchedule
    ActionSearch
    ActionSettingsApplications
    ActionSettingsBackupRestore
    ActionSettingsBluetooth
    ActionSettingsBrightness
    ActionSettingsCell
    ActionSettingsEthernet
    ActionSettingsInputAntenna
    ActionSettingsInputComponent
    ActionSettingsInputComposite
    ActionSettingsInputHdmi
    ActionSettingsInputSvideo
    ActionSettingsOverscan
    ActionSettingsPhone
    ActionSettingsPower
    ActionSettingsRemote
    ActionSettingsVoice
    ActionSettings
    ActionShopTwo
    ActionShop
    ActionShoppingBasket
    ActionShoppingCart
    ActionSpeakerNotesOff
    ActionSpeakerNotes
    ActionSpellcheck
    ActionStars
    ActionStore
    ActionSubject
    ActionSupervisorAccount
    ActionSwapHoriz
    ActionSwapVert
    ActionSwapVerticalCircle
    ActionSystemUpdateAlt
    ActionTabUnselected
    ActionTab
    ActionTheaters
    ActionThreeDRotation
    ActionThumbDown
    ActionThumbUp
    ActionThumbsUpDown
    ActionTimeline
    ActionToc
    ActionToday
    ActionToll
    ActionTouchApp
    ActionTrackChanges
    ActionTranslate
    ActionTrendingDown
    ActionTrendingFlat
    ActionTrendingUp
    ActionTurnedInNot
    ActionTurnedIn
    ActionUpdate
    ActionVerifiedUser
    ActionViewAgenda
    ActionViewArray
    ActionViewCarousel
    ActionViewColumn
    ActionViewDay
    ActionViewHeadline
    ActionViewList
    ActionViewModule
    ActionViewQuilt
    ActionViewStream
    ActionViewWeek
    ActionVisibilityOff
    ActionVisibility
    ActionWatchLater
    ActionWork
    ActionYoutubeSearchedFor
    ActionZoomIn
    ActionZoomOut
    AlertAddAlert
    AlertErrorOutline
    AlertError
    AlertWarning
    AvAddToQueue
    AvAirplay
    AvAlbum
    AvArtTrack
    AvAvTimer
    AvBrandingWatermark
    AvCallToAction
    AvClosedCaption
    AvEqualizer
    AvExplicit
    AvFastForward
    AvFastRewind
    AvFeaturedPlayList
    AvFeaturedVideo
    AvFiberDvr
    AvFiberManualRecord
    AvFiberNew
    AvFiberPin
    AvFiberSmartRecord
    AvForward10
    AvForward30
    AvForward5
    AvGames
    AvHd
    AvHearing
    AvHighQuality
    AvLibraryAdd
    AvLibraryBooks
    AvLibraryMusic
    AvLoop
    AvMicNone
    AvMicOff
    AvMic
    AvMovie
    AvMusicVideo
    AvNewReleases
    AvNotInterested
    AvNote
    AvPauseCircleFilled
    AvPauseCircleOutline
    AvPause
    AvPlayArrow
    AvPlayCircleFilled
    AvPlayCircleOutline
    AvPlaylistAddCheck
    AvPlaylistAdd
    AvPlaylistPlay
    AvQueueMusic
    AvQueuePlayNext
    AvQueue
    AvRadio
    AvRecentActors
    AvRemoveFromQueue
    AvRepeatOne
    AvRepeat
    AvReplay10
    AvReplay30
    AvReplay5
    AvReplay
    AvShuffle
    AvSkipNext
    AvSkipPrevious
    AvSlowMotionVideo
    AvSnooze
    AvSortByAlpha
    AvStop
    AvSubscriptions
    AvSubtitles
    AvSurroundSound
    AvVideoCall
    AvVideoLabel
    AvVideoLibrary
    AvVideocamOff
    AvVideocam
    AvVolumeDown
    AvVolumeMute
    AvVolumeOff
    AvVolumeUp
    AvWebAsset
    AvWeb
    CommunicationBusiness
    CommunicationCallEnd
    CommunicationCallMade
    CommunicationCallMerge
    CommunicationCallMissedOutgoing
    CommunicationCallMissed
    CommunicationCallReceived
    CommunicationCallSplit
    CommunicationCall
    CommunicationChatBubbleOutline
    CommunicationChatBubble
    CommunicationChat
    CommunicationClearAll
    CommunicationComment
    CommunicationContactMail
    CommunicationContactPhone
    CommunicationContacts
    CommunicationDialerSip
    CommunicationDialpad
    CommunicationEmail
    CommunicationForum
    CommunicationImportContacts
    CommunicationImportExport
    CommunicationInvertColorsOff
    CommunicationLiveHelp
    CommunicationLocationOff
    CommunicationLocationOn
    CommunicationMailOutline
    CommunicationMessage
    CommunicationNoSim
    CommunicationPhone
    CommunicationPhonelinkErase
    CommunicationPhonelinkLock
    CommunicationPhonelinkRing
    CommunicationPhonelinkSetup
    CommunicationPortableWifiOff
    CommunicationPresentToAll
    CommunicationRingVolume
    CommunicationRssFeed
    CommunicationScreenShare
    CommunicationSpeakerPhone
    CommunicationStayCurrentLandscape
    CommunicationStayCurrentPortrait
    CommunicationStayPrimaryLandscape
    CommunicationStayPrimaryPortrait
    CommunicationStopScreenShare
    CommunicationSwapCalls
    CommunicationTextsms
    CommunicationVoicemail
    CommunicationVpnKey
    ContentAddBox
    ContentAddCircleOutline
    ContentAddCircle
    ContentAdd
    ContentArchive
    ContentBackspace
    ContentBlock
    ContentClear
    ContentContentCopy
    ContentContentCut
    ContentContentPaste
    ContentCreate
    ContentDeleteSweep
    ContentDrafts
    ContentFilterList
    ContentFlag
    ContentFontDownload
    ContentForward
    ContentGesture
    ContentInbox
    ContentLink
    ContentLowPriority
    ContentMail
    ContentMarkunread
    ContentMoveToInbox
    ContentNextWeek
    ContentRedo
    ContentRemoveCircleOutline
    ContentRemoveCircle
    ContentRemove
    ContentReplyAll
    ContentReply
    ContentReport
    ContentSave
    ContentSelectAll
    ContentSend
    ContentSort
    ContentTextFormat
    ContentUnarchive
    ContentUndo
    ContentWeekend
    DeviceAccessAlarm
    DeviceAccessAlarms
    DeviceAccessTime
    DeviceAddAlarm
    DeviceAirplanemodeActive
    DeviceAirplanemodeInactive
    DeviceBattery20
    DeviceBattery30
    DeviceBattery50
    DeviceBattery60
    DeviceBattery80
    DeviceBattery90
    DeviceBatteryAlert
    DeviceBatteryCharging20
    DeviceBatteryCharging30
    DeviceBatteryCharging50
    DeviceBatteryCharging60
    DeviceBatteryCharging80
    DeviceBatteryCharging90
    DeviceBatteryChargingFull
    DeviceBatteryFull
    DeviceBatteryStd
    DeviceBatteryUnknown
    DeviceBluetoothConnected
    DeviceBluetoothDisabled
    DeviceBluetoothSearching
    DeviceBluetooth
    DeviceBrightnessAuto
    DeviceBrightnessHigh
    DeviceBrightnessLow
    DeviceBrightnessMedium
    DeviceDataUsage
    DeviceDeveloperMode
    DeviceDevices
    DeviceDvr
    DeviceGpsFixed
    DeviceGpsNotFixed
    DeviceGpsOff
    DeviceGraphicEq
    DeviceLocationDisabled
    DeviceLocationSearching
    DeviceNetworkCell
    DeviceNetworkWifi
    DeviceNfc
    DeviceScreenLockLandscape
    DeviceScreenLockPortrait
    DeviceScreenLockRotation
    DeviceScreenRotation
    DeviceSdStorage
    DeviceSettingsSystemDaydream
    DeviceSignalCellular0Bar
    DeviceSignalCellular1Bar
    DeviceSignalCellular2Bar
    DeviceSignalCellular3Bar
    DeviceSignalCellular4Bar
    DeviceSignalCellularConnectedNoInternet0Bar
    DeviceSignalCellularConnectedNoInternet1Bar
    DeviceSignalCellularConnectedNoInternet2Bar
    DeviceSignalCellularConnectedNoInternet3Bar
    DeviceSignalCellularConnectedNoInternet4Bar
    DeviceSignalCellularNoSim
    DeviceSignalCellularNull
    DeviceSignalCellularOff
    DeviceSignalWifi0Bar
    DeviceSignalWifi1BarLock
    DeviceSignalWifi1Bar
    DeviceSignalWifi2BarLock
    DeviceSignalWifi2Bar
    DeviceSignalWifi3BarLock
    DeviceSignalWifi3Bar
    DeviceSignalWifi4BarLock
    DeviceSignalWifi4Bar
    DeviceSignalWifiOff
    DeviceStorage
    DeviceUsb
    DeviceWallpaper
    DeviceWidgets
    DeviceWifiLock
    DeviceWifiTethering
    EditorAttachFile
    EditorAttachMoney
    EditorBorderAll
    EditorBorderBottom
    EditorBorderClear
    EditorBorderColor
    EditorBorderHorizontal
    EditorBorderInner
    EditorBorderLeft
    EditorBorderOuter
    EditorBorderRight
    EditorBorderStyle
    EditorBorderTop
    EditorBorderVertical
    EditorBubbleChart
    EditorDragHandle
    EditorFormatAlignCenter
    EditorFormatAlignJustify
    EditorFormatAlignLeft
    EditorFormatAlignRight
    EditorFormatBold
    EditorFormatClear
    EditorFormatColorFill
    EditorFormatColorReset
    EditorFormatColorText
    EditorFormatIndentDecrease
    EditorFormatIndentIncrease
    EditorFormatItalic
    EditorFormatLineSpacing
    EditorFormatListBulleted
    EditorFormatListNumbered
    EditorFormatPaint
    EditorFormatQuote
    EditorFormatShapes
    EditorFormatSize
    EditorFormatStrikethrough
    EditorFormatTextdirectionLToR
    EditorFormatTextdirectionRToL
    EditorFormatUnderlined
    EditorFunctions
    EditorHighlight
    EditorInsertChart
    EditorInsertComment
    EditorInsertDriveFile
    EditorInsertEmoticon
    EditorInsertInvitation
    EditorInsertLink
    EditorInsertPhoto
    EditorLinearScale
    EditorMergeType
    EditorModeComment
    EditorModeEdit
    EditorMonetizationOn
    EditorMoneyOff
    EditorMultilineChart
    EditorPieChartOutlined
    EditorPieChart
    EditorPublish
    EditorShortText
    EditorShowChart
    EditorSpaceBar
    EditorStrikethroughS
    EditorTextFields
    EditorTitle
    EditorVerticalAlignBottom
    EditorVerticalAlignCenter
    EditorVerticalAlignTop
    EditorWrapText
    FileAttachment
    FileCloudCircle
    FileCloudDone
    FileCloudDownload
    FileCloudOff
    FileCloudQueue
    FileCloudUpload
    FileCloud
    FileCreateNewFolder
    FileFileDownload
    FileFileUpload
    FileFolderOpen
    FileFolderShared
    FileFolder
    HardwareCastConnected
    HardwareCast
    HardwareComputer
    HardwareDesktopMac
    HardwareDesktopWindows
    HardwareDeveloperBoard
    HardwareDeviceHub
    HardwareDevicesOther
    HardwareDock
    HardwareGamepad
    HardwareHeadsetMic
    HardwareHeadset
    HardwareKeyboardArrowDown
    HardwareKeyboardArrowLeft
    HardwareKeyboardArrowRight
    HardwareKeyboardArrowUp
    HardwareKeyboardBackspace
    HardwareKeyboardCapslock
    HardwareKeyboardHide
    HardwareKeyboardReturn
    HardwareKeyboardTab
    HardwareKeyboardVoice
    HardwareKeyboard
    HardwareLaptopChromebook
    HardwareLaptopMac
    HardwareLaptopWindows
    HardwareLaptop
    HardwareMemory
    HardwareMouse
    HardwarePhoneAndroid
    HardwarePhoneIphone
    HardwarePhonelinkOff
    HardwarePhonelink
    HardwarePowerInput
    HardwareRouter
    HardwareScanner
    HardwareSecurity
    HardwareSimCard
    HardwareSmartphone
    HardwareSpeakerGroup
    HardwareSpeaker
    HardwareTabletAndroid
    HardwareTabletMac
    HardwareTablet
    HardwareToys
    HardwareTv
    HardwareVideogameAsset
    HardwareWatch
    ImageAddAPhoto
    ImageAddToPhotos
    ImageAdjust
    ImageAssistantPhoto
    ImageAssistant
    ImageAudiotrack
    ImageBlurCircular
    ImageBlurLinear
    ImageBlurOff
    ImageBlurOn
    ImageBrightness1
    ImageBrightness2
    ImageBrightness3
    ImageBrightness4
    ImageBrightness5
    ImageBrightness6
    ImageBrightness7
    ImageBrokenImage
    ImageBrush
    ImageBurstMode
    ImageCameraAlt
    ImageCameraFront
    ImageCameraRear
    ImageCameraRoll
    ImageCamera
    ImageCenterFocusStrong
    ImageCenterFocusWeak
    ImageCollectionsBookmark
    ImageCollections
    ImageColorLens
    ImageColorize
    ImageCompare
    ImageControlPointDuplicate
    ImageControlPoint
    ImageCrop169
    ImageCrop32
    ImageCrop54
    ImageCrop75
    ImageCropDin
    ImageCropFree
    ImageCropLandscape
    ImageCropOriginal
    ImageCropPortrait
    ImageCropRotate
    ImageCropSquare
    ImageCrop
    ImageDehaze
    ImageDetails
    ImageEdit
    ImageExposureNeg1
    ImageExposureNeg2
    ImageExposurePlus1
    ImageExposurePlus2
    ImageExposureZero
    ImageExposure
    ImageFilter1
    ImageFilter2
    ImageFilter3
    ImageFilter4
    ImageFilter5
    ImageFilter6
    ImageFilter7
    ImageFilter8
    ImageFilter9Plus
    ImageFilter9
    ImageFilterBAndW
    ImageFilterCenterFocus
    ImageFilterDrama
    ImageFilterFrames
    ImageFilterHdr
    ImageFilterNone
    ImageFilterTiltShift
    ImageFilterVintage
    ImageFilter
    ImageFlare
    ImageFlashAuto
    ImageFlashOff
    ImageFlashOn
    ImageFlip
    ImageGradient
    ImageGrain
    ImageGridOff
    ImageGridOn
    ImageHdrOff
    ImageHdrOn
    ImageHdrStrong
    ImageHdrWeak
    ImageHealing
    ImageImageAspectRatio
    ImageImage
    ImageIso
    ImageLandscape
    ImageLeakAdd
    ImageLeakRemove
    ImageLens
    ImageLinkedCamera
    ImageLooks3
    ImageLooks4
    ImageLooks5
    ImageLooks6
    ImageLooksOne
    ImageLooksTwo
    ImageLooks
    ImageLoupe
    ImageMonochromePhotos
    ImageMovieCreation
    ImageMovieFilter
    ImageMusicNote
    ImageNaturePeople
    ImageNature
    ImageNavigateBefore
    ImageNavigateNext
    ImagePalette
    ImagePanoramaFishEye
    ImagePanoramaHorizontal
    ImagePanoramaVertical
    ImagePanoramaWideAngle
    ImagePanorama
    ImagePhotoAlbum
    ImagePhotoCamera
    ImagePhotoFilter
    ImagePhotoLibrary
    ImagePhotoSizeSelectActual
    ImagePhotoSizeSelectLarge
    ImagePhotoSizeSelectSmall
    ImagePhoto
    ImagePictureAsPdf
    ImagePortrait
    ImageRemoveRedEye
    ImageRotate90DegreesCcw
    ImageRotateLeft
    ImageRotateRight
    ImageSlideshow
    ImageStraighten
    ImageStyle
    ImageSwitchCamera
    ImageSwitchVideo
    ImageTagFaces
    ImageTexture
    ImageTimelapse
    ImageTimer10
    ImageTimer3
    ImageTimerOff
    ImageTimer
    ImageTonality
    ImageTransform
    ImageTune
    ImageViewComfy
    ImageViewCompact
    ImageVignette
    ImageWbAuto
    ImageWbCloudy
    ImageWbIncandescent
    ImageWbIridescent
    ImageWbSunny
    MapsAddLocation
    MapsBeenhere
    MapsDirectionsBike
    MapsDirectionsBoat
    MapsDirectionsBus
    MapsDirectionsCar
    MapsDirectionsRailway
    MapsDirectionsRun
    MapsDirectionsSubway
    MapsDirectionsTransit
    MapsDirectionsWalk
    MapsDirections
    MapsEditLocation
    MapsEvStation
    MapsFlight
    MapsHotel
    MapsLayersClear
    MapsLayers
    MapsLocalActivity
    MapsLocalAirport
    MapsLocalAtm
    MapsLocalBar
    MapsLocalCafe
    MapsLocalCarWash
    MapsLocalConvenienceStore
    MapsLocalDining
    MapsLocalDrink
    MapsLocalFlorist
    MapsLocalGasStation
    MapsLocalGroceryStore
    MapsLocalHospital
    MapsLocalHotel
    MapsLocalLaundryService
    MapsLocalLibrary
    MapsLocalMall
    MapsLocalMovies
    MapsLocalOffer
    MapsLocalParking
    MapsLocalPharmacy
    MapsLocalPhone
    MapsLocalPizza
    MapsLocalPlay
    MapsLocalPostOffice
    MapsLocalPrintshop
    MapsLocalSee
    MapsLocalShipping
    MapsLocalTaxi
    MapsMap
    MapsMyLocation
    MapsNavigation
    MapsNearMe
    MapsPersonPinCircle
    MapsPersonPin
    MapsPinDrop
    MapsPlace
    MapsRateReview
    MapsRestaurantMenu
    MapsRestaurant
    MapsSatellite
    MapsStoreMallDirectory
    MapsStreetview
    MapsSubway
    MapsTerrain
    MapsTraffic
    MapsTrain
    MapsTram
    MapsTransferWithinAStation
    MapsZoomOutMap
    NavigationApps
    NavigationArrowBack
    NavigationArrowDownward
    NavigationArrowDropDownCircle
    NavigationArrowDropDown
    NavigationArrowDropUp
    NavigationArrowForward
    NavigationArrowUpward
    NavigationCancel
    NavigationCheck
    NavigationChevronLeft
    NavigationChevronRight
    NavigationClose
    NavigationExpandLess
    NavigationExpandMore
    NavigationFirstPage
    NavigationFullscreenExit
    NavigationFullscreen
    NavigationLastPage
    NavigationMenu
    NavigationMoreHoriz
    NavigationMoreVert
    NavigationRefresh
    NavigationSubdirectoryArrowLeft
    NavigationSubdirectoryArrowRight
    NavigationUnfoldLess
    NavigationUnfoldMore
    NavigationArrowDropRight
    NotificationAdb
    NotificationAirlineSeatFlatAngled
    NotificationAirlineSeatFlat
    NotificationAirlineSeatIndividualSuite
    NotificationAirlineSeatLegroomExtra
    NotificationAirlineSeatLegroomNormal
    NotificationAirlineSeatLegroomReduced
    NotificationAirlineSeatReclineExtra
    NotificationAirlineSeatReclineNormal
    NotificationBluetoothAudio
    NotificationConfirmationNumber
    NotificationDiscFull
    NotificationDoNotDisturbAlt
    NotificationDoNotDisturbOff
    NotificationDoNotDisturbOn
    NotificationDoNotDisturb
    NotificationDriveEta
    NotificationEnhancedEncryption
    NotificationEventAvailable
    NotificationEventBusy
    NotificationEventNote
    NotificationFolderSpecial
    NotificationLiveTv
    NotificationMms
    NotificationMore
    NotificationNetworkCheck
    NotificationNetworkLocked
    NotificationNoEncryption
    NotificationOndemandVideo
    NotificationPersonalVideo
    NotificationPhoneBluetoothSpeaker
    NotificationPhoneForwarded
    NotificationPhoneInTalk
    NotificationPhoneLocked
    NotificationPhoneMissed
    NotificationPhonePaused
    NotificationPower
    NotificationPriorityHigh
    NotificationRvHookup
    NotificationSdCard
    NotificationSimCardAlert
    NotificationSmsFailed
    NotificationSms
    NotificationSyncDisabled
    NotificationSyncProblem
    NotificationSync
    NotificationSystemUpdate
    NotificationTapAndPlay
    NotificationTimeToLeave
    NotificationVibration
    NotificationVoiceChat
    NotificationVpnLock
    NotificationWc
    NotificationWifi
    PlacesAcUnit
    PlacesAirportShuttle
    PlacesAllInclusive
    PlacesBeachAccess
    PlacesBusinessCenter
    PlacesCasino
    PlacesChildCare
    PlacesChildFriendly
    PlacesFitnessCenter
    PlacesFreeBreakfast
    PlacesGolfCourse
    PlacesHotTub
    PlacesKitchen
    PlacesPool
    PlacesRoomService
    PlacesRvHookup
    PlacesSmokeFree
    PlacesSmokingRooms
    PlacesSpa
    SocialCake
    SocialDomain
    SocialGroupAdd
    SocialGroup
    SocialLocationCity
    SocialMoodBad
    SocialMood
    SocialNotificationsActive
    SocialNotificationsNone
    SocialNotificationsOff
    SocialNotificationsPaused
    SocialNotifications
    SocialPages
    SocialPartyMode
    SocialPeopleOutline
    SocialPeople
    SocialPersonAdd
    SocialPersonOutline
    SocialPerson
    SocialPlusOne
    SocialPoll
    SocialPublic
    SocialSchool
    SocialSentimentDissatisfied
    SocialSentimentNeutral
    SocialSentimentSatisfied
    SocialSentimentVeryDissatisfied
    SocialSentimentVerySatisfied
    SocialShare
    SocialWhatshot
    ToggleCheckBoxOutlineBlank
    ToggleCheckBox
    ToggleIndeterminateCheckBox
    ToggleRadioButtonChecked
    ToggleRadioButtonUnchecked
    ToggleStarBorder
    ToggleStarHalf
    ToggleStar
    ])

(defmacro generate-mui-icon-fns [fname]
  `(m/generate-mui-dom-fns ~fname ~tags))

(comment
  (macroexpand `(generate-mui-icon-fns "create-mui-icon")))

