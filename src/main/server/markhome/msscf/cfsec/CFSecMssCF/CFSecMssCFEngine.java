
// Description: Java 11 MssCF CFEngine for CFSec

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.sql.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import org.msscf.msscf.cfcore.CFGenKbObj.*;

public abstract class CFSecMssCFEngine
	extends MssCFEngine
{
	private static final long serialVersionUID = 1L;
	public static final String ITEMNAME_TOP = "top";
	protected ICFSecSchemaObj cFSecSchema = null;

	public CFSecMssCFEngine() {
		super();
		setTargetRuleName( ITEMNAME_TOP );
	}

	public abstract String fixGenDefName( String rawName );

	public ICFSecSchemaObj getCFSecSchema() {
		return( cFSecSchema );
	}

	public void setCFSecSchema( ICFSecSchemaObj value ) {
		cFSecSchema = value;
	}

	public void init( String generatingBuild,
		ICFGenKbSchemaObj argCFGenKbSchema,
		ICFGenKbTenantObj argTenant,
		ICFSecSchemaObj argCFSecSchema,
		String strRootGenDir )
	{
		setCFSecSchema( argCFSecSchema );
		init( generatingBuild, argCFGenKbSchema, argTenant, strRootGenDir );
	}

	public void init( String generatingBuild,
		ICFGenKbSchemaObj argCFGenKbSchema,
		ICFGenKbTenantObj argTenant,
		String strRootGenDir )
	{
		super.init( generatingBuild, argCFGenKbSchema, argTenant, strRootGenDir );
		setGenContext( getGenContextFactory().newGenContext( generatingBuild,
			this,
			strRootGenDir,
			"any",
			"Object",
			"Object",
			getTargetRuleName() ) );
	}

	public ICFGenKbGenFileObj defineFile(
		String	definedNear,
		String	toolsetName,
		String	scopeDefClassName,
		String	genDefClassName,
		String	itemName,
		String	expansionBody,
		String	generateOnce,
		String	sourceBundle,
		String	moduleName,
		String	basePackageName,
		String	subPackageName,
		String	expansionClassName,
		String	expansionKeyName,
		String	expansionFileName )
	{
		return(
			super.defineFile( definedNear,
				toolsetName,
				fixGenDefName(scopeDefClassName),
				fixGenDefName(genDefClassName),
				itemName,
				expansionBody,
				generateOnce,
				sourceBundle,
				moduleName,
				basePackageName,
				subPackageName,
				expansionClassName,
				expansionKeyName,
				expansionFileName) );
	}

	public ICFGenKbGenRuleObj defineRule(
		String	definedNear,
		String	toolsetName,
		String	scopeDefClassName,
		String	genDefClassName,
		String	itemName,
		String	expansionBody )
	{
		return(
			super.defineRule( definedNear,
				toolsetName,
				fixGenDefName(scopeDefClassName),
				fixGenDefName(genDefClassName),
				itemName,
				expansionBody ) );
	}

	public ICFGenKbGenTruncObj defineTrunc(
		String	definedNear,
		String	toolsetName,
		String	scopeDefClassName,
		String	genDefClassName,
		String	itemName,
		String	expansionBody,
		int		truncAt  )
	{
		return(
			super.defineTrunc( definedNear,
				toolsetName,
				fixGenDefName(scopeDefClassName),
				fixGenDefName(genDefClassName),
				itemName,
				expansionBody,
				truncAt) );
	}

	public void bootstrapDefClasses() {
		ICFGenKbDefClassObj defClassObject = bootstrapDefClass( "Object", null );
		ICFGenKbDefClassObj defClassCluster = bootstrapDefClass( "Cluster", defClassObject );
		ICFGenKbDefClassObj defClassHostNode = bootstrapDefClass( "HostNode", defClassObject );
		ICFGenKbDefClassObj defClassISOCcy = bootstrapDefClass( "ISOCcy", defClassObject );
		ICFGenKbDefClassObj defClassISOCtry = bootstrapDefClass( "ISOCtry", defClassObject );
		ICFGenKbDefClassObj defClassISOCtryCcy = bootstrapDefClass( "ISOCtryCcy", defClassObject );
		ICFGenKbDefClassObj defClassISOCtryLang = bootstrapDefClass( "ISOCtryLang", defClassObject );
		ICFGenKbDefClassObj defClassISOLang = bootstrapDefClass( "ISOLang", defClassObject );
		ICFGenKbDefClassObj defClassISOTZone = bootstrapDefClass( "ISOTZone", defClassObject );
		ICFGenKbDefClassObj defClassSecApp = bootstrapDefClass( "SecApp", defClassObject );
		ICFGenKbDefClassObj defClassSecDevice = bootstrapDefClass( "SecDevice", defClassObject );
		ICFGenKbDefClassObj defClassSecForm = bootstrapDefClass( "SecForm", defClassObject );
		ICFGenKbDefClassObj defClassSecGroup = bootstrapDefClass( "SecGroup", defClassObject );
		ICFGenKbDefClassObj defClassSecGroupForm = bootstrapDefClass( "SecGroupForm", defClassObject );
		ICFGenKbDefClassObj defClassSecGrpInc = bootstrapDefClass( "SecGrpInc", defClassObject );
		ICFGenKbDefClassObj defClassSecGrpMemb = bootstrapDefClass( "SecGrpMemb", defClassObject );
		ICFGenKbDefClassObj defClassSecSession = bootstrapDefClass( "SecSession", defClassObject );
		ICFGenKbDefClassObj defClassSecUser = bootstrapDefClass( "SecUser", defClassObject );
		ICFGenKbDefClassObj defClassService = bootstrapDefClass( "Service", defClassObject );
		ICFGenKbDefClassObj defClassServiceType = bootstrapDefClass( "ServiceType", defClassObject );
		ICFGenKbDefClassObj defClassSysCluster = bootstrapDefClass( "SysCluster", defClassObject );
		ICFGenKbDefClassObj defClassTSecGroup = bootstrapDefClass( "TSecGroup", defClassObject );
		ICFGenKbDefClassObj defClassTSecGrpInc = bootstrapDefClass( "TSecGrpInc", defClassObject );
		ICFGenKbDefClassObj defClassTSecGrpMemb = bootstrapDefClass( "TSecGrpMemb", defClassObject );
		ICFGenKbDefClassObj defClassTenant = bootstrapDefClass( "Tenant", defClassObject );
	}

	public void bootstrapBindings() {
		ICFGenKbGenBindObj bind = null;
		ICFGenKbGenBindEditObj editBind = null;
		ICFGenKbRuleCartObj ruleCart = this.getInternalRuleCart();
		ICFGenKbRuleTypeObj ruleTypeBind = this.getRuleTypeTableObj().readRuleTypeByNameIdx("Bind");

		bind = new CFSecMssCFBindClusterId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindClusterFullDomName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindClusterDescription( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHostNodeClusterId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHostNodeHostNodeId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHostNodeDescription( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHostNodeHostName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOCcyISOCcyId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOCcyISOCode( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOCcyName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOCcyUnitSymbol( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasISOCcyUnitSymbol( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOCcyPrecis( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOCtryISOCtryId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOCtryISOCode( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOCtryName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOCtryCcyISOCtryId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOCtryCcyISOCcyId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOCtryLangISOCtryId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOCtryLangISOLangId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOLangISOLangId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOLangISO6392Code( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOLangISO6391Code( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasISOLangISO6391Code( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOLangEnglishName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOTZoneISOTZoneId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOTZoneIso8601( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOTZoneTZName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOTZoneTZHourOffset( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOTZoneTZMinOffset( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOTZoneDescription( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindISOTZoneVisible( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecAppClusterId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecAppSecAppId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecAppJEEMountName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecDeviceSecUserId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecDeviceDevName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecDevicePubKey( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasSecDevicePubKey( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecFormClusterId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecFormSecFormId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecFormSecAppId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecFormJEEServletMapName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGroupClusterId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGroupSecGroupId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGroupName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGroupIsVisible( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGroupFormClusterId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGroupFormSecGroupFormId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGroupFormSecGroupId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGroupFormSecAppId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGroupFormSecFormId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGrpIncClusterId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGrpIncSecGrpIncId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGrpIncSecGroupId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGrpIncIncludeGroupId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGrpMembClusterId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGrpMembSecGrpMembId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGrpMembSecGroupId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecGrpMembSecUserId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecSessionSecSessionId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecSessionSecUserId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecSessionSecDevName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasSecSessionSecDevName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecSessionStart( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecSessionFinish( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasSecSessionFinish( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecSessionSecProxyId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasSecSessionSecProxyId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecUserSecUserId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecUserLoginId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecUserEMailAddress( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecUserEMailConfirmUuid( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasSecUserEMailConfirmUuid( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecUserDfltDevUserId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasSecUserDfltDevUserId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecUserDfltDevName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasSecUserDfltDevName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecUserPasswordHash( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSecUserPasswordResetUuid( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasSecUserPasswordResetUuid( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasSecUserDefDev( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindServiceClusterId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindServiceServiceId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindServiceHostNodeId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindServiceServiceTypeId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindServiceHostPort( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasServiceHost( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindHasServiceServiceType( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindServiceTypeServiceTypeId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindServiceTypeDescription( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSysClusterSingletonId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindSysClusterClusterId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTSecGroupTenantId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTSecGroupTSecGroupId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTSecGroupName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTSecGroupIsVisible( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTSecGrpIncTenantId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTSecGrpIncTSecGrpIncId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTSecGrpIncTSecGroupId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTSecGrpIncIncludeGroupId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTSecGrpMembTenantId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTSecGrpMembTSecGrpMembId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTSecGrpMembTSecGroupId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTSecGrpMembSecUserId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTenantClusterId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTenantId( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new CFSecMssCFBindTenantTenantName( this );
		editBind = (ICFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	public void bootstrapIterators() {
		ICFGenKbGenIteratorObj iterator = null;
		ICFGenKbGenIteratorEditObj editIterator = null;
		ICFGenKbRuleCartObj ruleCart = this.getInternalRuleCart();
		ICFGenKbRuleTypeObj ruleTypeIterator = this.getRuleTypeTableObj().readRuleTypeByNameIdx("Iterator");

		iterator = new CFSecMssCFIterateClusterHostNode( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateClusterTenant( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateClusterSecApp( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateClusterSecGroup( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateClusterSysCluster( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateHostNodeService( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateISOCcyCtry( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateISOCtryCcy( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateISOCtryLang( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateISOLangCtry( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateSecAppForm( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateSecGroupInclude( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateSecGroupMember( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateSecGroupIncByGroup( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateSecGroupForm( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateSecUserSecDev( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateSecUserSecSess( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateSecUserSecProxy( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateSecUserSecGrpMemb( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateSecUserTSecGrpMemb( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateServiceTypeDeployed( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateTSecGroupInclude( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateTSecGroupMember( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateTSecGroupIncByGroup( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new CFSecMssCFIterateTenantTSecGroup( this );
		editIterator = (ICFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	public void bootstrapReferences() {
		ICFGenKbGenReferenceObj refer = null;
		ICFGenKbGenReferenceEditObj editRefer = null;
		ICFGenKbRuleCartObj ruleCart = this.getInternalRuleCart();
		ICFGenKbRuleTypeObj ruleTypeReference = this.getRuleTypeTableObj().readRuleTypeByNameIdx("Reference");

		refer = new CFSecMssCFReferenceHostNodeCluster( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceISOCtryCcyCtry( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceISOCtryCcyCcy( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceISOCtryLangCtry( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceISOCtryLangLang( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecAppCluster( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecDeviceSecUser( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecFormCluster( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecFormApplication( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecGroupCluster( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecGroupFormCluster( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecGroupFormGroup( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecGroupFormApp( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecGroupFormForm( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecGrpIncCluster( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecGrpIncGroup( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecGrpIncSubGroup( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecGrpMembCluster( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecGrpMembGroup( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecGrpMembUser( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecSessionSecUser( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecSessionSecProxy( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSecUserDefDev( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceServiceCluster( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceServiceHost( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceServiceServiceType( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceSysClusterCluster( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceTSecGroupTenant( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceTSecGrpIncTenant( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceTSecGrpIncGroup( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceTSecGrpIncSubGroup( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceTSecGrpMembTenant( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceTSecGrpMembGroup( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceTSecGrpMembUser( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new CFSecMssCFReferenceTenantCluster( this );
		editRefer = (ICFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}}
